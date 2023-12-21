package org.hackaboss.c7d8ejercicio1.repository;

import org.hackaboss.c7d8ejercicio1.model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarRepository {


    List<Car> cars = new ArrayList<>();



    public String saveCar(Car car) {
        car.setId((long) (cars.size()+1));
        cars.add(car);
        return "Car "+ car.getBrand() +" saved";
    }

    public List<Car> getAllCars() {
        return cars;
    }

    //Buscamos vehículo por precio de menos a mayor
    public List<Car> findCarsByPrice() {
        return cars.stream()
              .sorted((car1, car2) -> car1.getPrice().compareTo(car2.getPrice()))
              .collect(Collectors.toList());
    }

    public Car findCarById(Long id) {
        return cars.stream()
             .filter(car -> car.getId().equals(id))
             .findFirst()
             .orElse(null);
    }



}
