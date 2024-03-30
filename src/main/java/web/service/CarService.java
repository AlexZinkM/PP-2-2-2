package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> showAll();
    List<Car> showCOUNT(int count);
}
