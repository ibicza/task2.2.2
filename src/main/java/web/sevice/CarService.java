package web.sevice;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    private final List<Car> cars = Arrays.asList(
            new Car("Toyota", "Camry", 2020),
            new Car("Honda", "Accord", 2019),
            new Car("Ford", "Mustang", 2021),
            new Car("Chevrolet", "Camaro", 2022),
            new Car("BMW", "X5", 2023)
    );


    public List<Car> getCars(Integer count) {

        if (count == null || count >= 5) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());


    }
}

