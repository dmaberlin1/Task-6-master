package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

@Controller
@RequestMapping("/cars")
public class CarController {

    @GetMapping()
    public String getCars(@RequestParam(value = "count", defaultValue = "5", required = false) int allCars, Model model) {
        List<Car> carsList = new ArrayList<>();
        carsList.add(new Car("350x", "Nissan", "black", 2700));
        carsList.add(new Car("518", "BMW", "yellow", 1800));
        carsList.add(new Car("320M", "BMW", "white", 3200));
        carsList.add(new Car("Vectra", "Opel", "green", 2400));
        List<Car> carsList1 = CarService.carsCount(carsList, allCars);
        model.addAttribute("carsList", carsList1);
        return "cars";
    }

}
