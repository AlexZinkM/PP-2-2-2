package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.DAO.UserDAOImpl;
import web.model.User;
import web.service.UserService;


@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping()
    public String welcome() {
        return "index";
    }


    @GetMapping("/users")
    public String getAll(Model model) {
        model.addAttribute("users", userService.getAll());
        return "users";
    }


    @GetMapping("/get")
    public String get(@RequestParam(value = "id") Long id, Model model) {
        User user = userService.get(id);
        if (user == null) {
            return "errorPage";
        }
        model.addAttribute("user", user);
        return "get";
    }


    @GetMapping(value = "/form")
    public String addUserForm(@ModelAttribute("user") User user) {
        return "form";
    }

    @PostMapping()
    public String create(@ModelAttribute("person") User user) {
        userService.create(user);
        return "redirect:/users";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam(value = "id") Long id) {
        if (userService.get(id) == null) {
            return "errorPage";
        }
        userService.delete(id);
        return "deleteCompleted";
    }

    @GetMapping("/update")
    public String update(@ModelAttribute("user") User user) {
        userService.update(user);
        return "changeCompleted";
    }


    @GetMapping("/completed")
    public String showChangeCompletedPage() {
        return "changeCompleted";
    }


}