package com.likith.Car.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.service.annotation.DeleteExchange;

import com.likith.Car.model.Car;
import com.likith.Car.model.service.CarServiceimpl;





// http://localhost:8080/Car
@RestController
@RequestMapping("/Car")
@CrossOrigin(origins = "http://localhost:5173")
public class CarController {
	
	@Autowired
	CarServiceimpl carServiceimpl;
	
	@PostMapping("/Saved")
	Car createCar(@RequestBody Car c)
	{
		return carServiceimpl.saveCar(c);
	}
	
	
	@GetMapping("See")
	List<Car> getAllCar()
	{
		return carServiceimpl.getAllCar();
	}
	
	
	@GetMapping("/Car/{id}")
	Car getCar(@PathVariable Integer id)
	{
		return carServiceimpl.getCar(id);
	}
	
	
	@DeleteMapping("/delete/{id}")
	public String deleteCar(@PathVariable Integer id)
	{
		return carServiceimpl.deleteCar(id);
	}
	
	
	@PutMapping("/update/{id}")
	Car updateCar(@PathVariable Integer id, @RequestBody Car c)
	{
		return carServiceimpl.updateCar(id, c);
	}
	

	@GetMapping("hello")
	String hello()
	{
		return "good morning";
	}
	
	
}
