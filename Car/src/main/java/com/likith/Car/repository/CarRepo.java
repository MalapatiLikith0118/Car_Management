package com.likith.Car.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.likith.Car.model.Car;

@Repository

public interface CarRepo extends JpaRepository<Car, Integer>{
	

}
