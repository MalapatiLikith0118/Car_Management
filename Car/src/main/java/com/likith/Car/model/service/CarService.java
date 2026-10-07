package com.likith.Car.model.service;

import java.util.List;

import com.likith.Car.model.Car;

// interface means what to do but not how to do..

public interface CarService {
	
	Car saveCar(Car c);
	
	Car getCar(Integer id);
	
	List<Car> getAllCar();
	
	String deleteCar(Integer id);
	
	Car updateCar(Integer id, Car car);

}
