package org.hackaboss.c7d8ejercicio1.controller;

import org.hackaboss.c7d8ejercicio1.model.Car;
import org.hackaboss.c7d8ejercicio1.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CarController {

     @Autowired
     private CarRepository carRepository;

    @PostMapping("/vehicles")
    public String saveCar(@RequestBody Car car) {
        return carRepository.saveCar(car);
    }

    @GetMapping("/vehicles")
    public Iterable<Car> getAllCars() {
        return carRepository.getAllCars();
    }


    @GetMapping("/vehicles/price")
    public Iterable<Car> getCarsByPrice() {
        return carRepository.findCarsByPrice();
    }

    @GetMapping("/vehicles/{id}")
    public Car getCarById(@PathVariable("id") Long id) {
        return carRepository.findCarById(id);
    }




}
