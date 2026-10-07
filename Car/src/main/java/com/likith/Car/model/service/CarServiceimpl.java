package com.likith.Car.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.likith.Car.model.Car;
import com.likith.Car.repository.CarRepo;


// This class is helping how to do what we declared in interface
@Service

public class CarServiceimpl implements CarService{
	
	
	@Autowired
	CarRepo carRepo;

	@Override
	public Car saveCar(Car c) {
		
		return carRepo.save(c);
	}
	
	

	@Override
	public Car getCar(Integer id) {

		
		return carRepo.findById(id).orElseThrow() ;
	}
	
	

	@Override
	public List<Car> getAllCar() {

		return carRepo.findAll();
	}
	
	

	@Override
	public String deleteCar(Integer id) {
		
		carRepo.deleteById(id);
		
		return "Car "+ id +"successfully deleted";
	}

	
	
	@Override
	public Car updateCar(Integer id, Car car) {
		Car exestingCar = carRepo.findById(id).orElseThrow();
		
		
		exestingCar.setCar_Name(car.getCar_Name());
		exestingCar.setCar_Company(car.getCar_Company());
		exestingCar.setCar_Model(car.getCar_Model());
		exestingCar.setPrice(car.getPrice());
		
		
		return carRepo.save(exestingCar);
	}
	
	

}
