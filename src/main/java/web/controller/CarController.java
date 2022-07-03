package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Car;
import web.Service.CarService;

import java.util.List;
import java.util.Optional;

@Controller
public class CarController {
    @Autowired
    CarService carService;

    @GetMapping(value = "/cars")
    public String printCarArray(
            @RequestParam(value = "count", required = false) Optional<Integer> count,
            Model model) {
        List<Car> cars = carService.getCarCount(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
