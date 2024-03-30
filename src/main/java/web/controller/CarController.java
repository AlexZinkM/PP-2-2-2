package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
public class CarController {


    private final CarServiceImpl csi;

    @Autowired
    public CarController(CarServiceImpl csi) {
        this.csi = csi;
    }


    @GetMapping(value = "/cars")
    public String showAll(Model model) {
        model.addAttribute("cars", csi.showAll());
        return "cars";
    }

    @GetMapping(value = "/cars?count={count}")
    public String showCOUNT(@RequestParam("count") int count, Model model) {
        model.addAttribute("carsCount", csi.showCOUNT(count));
        return "carsCount";
    }


}
