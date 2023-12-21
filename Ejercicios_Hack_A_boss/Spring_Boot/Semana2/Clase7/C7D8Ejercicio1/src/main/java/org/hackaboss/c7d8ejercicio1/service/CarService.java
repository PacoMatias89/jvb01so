package org.hackaboss.c7d8ejercicio1.service;

import org.hackaboss.c7d8ejercicio1.model.Car;
import org.hackaboss.c7d8ejercicio1.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService implements ICarService {

    @Autowired
    private CarRepository carRepository;


    @Override
    public String saveCar(Car car) {
        return carRepository.saveCar(car);
    }

    @Override
    public List<Car> getAllCars() {
        return carRepository.getAllCars();
    }

    @Override
    public List<Car> getCarsByPrice() {
        return carRepository.findCarsByPrice();
    }

    @Override
    public Car getCarById(Long id) {
        return carRepository.findCarById(id);
    }


}
