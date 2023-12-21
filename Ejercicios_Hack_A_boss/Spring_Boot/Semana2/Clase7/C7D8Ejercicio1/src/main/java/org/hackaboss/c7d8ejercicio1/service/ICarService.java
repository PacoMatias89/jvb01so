package org.hackaboss.c7d8ejercicio1.service;

import org.hackaboss.c7d8ejercicio1.model.Car;

import java.util.List;

public interface ICarService {

    public String saveCar(Car car);

    public List<Car> getAllCars();

    public List<Car> getCarsByPrice();

    public Car getCarById(Long id);



}
