package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public String showCOUNT(@RequestParam(value = "count", required = false) Integer count, Model model) {
        if (count != null) {
            model.addAttribute("cars", csi.showCOUNT(count));
        } else {
            model.addAttribute("cars", csi.showAll());
        }
        return "cars";
    }

}
