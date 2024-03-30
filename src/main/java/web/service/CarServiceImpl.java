package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private static int COUNT_CARS = 1;
    private static List<Car> carsList;

    {
        carsList = new ArrayList<>();
        carsList.add(new Car(COUNT_CARS++, "John", "Toyota", "12345"));
        carsList.add(new Car(COUNT_CARS++,"Alice", "Honda", "67890"));
        carsList.add(new Car(COUNT_CARS++,"Bob", "Ford", "54321"));
        carsList.add(new Car(COUNT_CARS++,"Emily", "Chevrolet", "98765"));
        carsList.add(new Car(COUNT_CARS++,"Mike", "Nissan", "13579"));
    }

    public List<Car> showAll() {return carsList;}

    public List<Car> showCOUNT(int count) {
       return carsList.stream().limit(count).toList();
    }



}


