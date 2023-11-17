package web.service;

import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    public static List<Car> carsCount(List<Car> carList, int limit) {
        if (limit == 0 || limit > 5) {
            return carList;
        }
        return carList.stream().limit(limit).collect(Collectors.toList());
    }

}
