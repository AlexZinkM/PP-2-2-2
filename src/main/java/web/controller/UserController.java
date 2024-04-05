package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.service.UserDAOImpl;


@Controller
public class UserController {
    private final UserDAOImpl udi;

    @Autowired
    public UserController(UserDAOImpl udi) {
        this.udi = udi;
    }


    @GetMapping(value = "/users")
    public String showAll(Model model) {
            model.addAttribute("users", udi.showAll());
        return "users";
    }

}
