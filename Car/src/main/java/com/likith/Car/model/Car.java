package com.likith.Car.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "car_Showroom")
@Setter
@Getter
public class Car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer car_Id;
	
	String car_Name;
	String car_Model;
	String car_Company;
	
	double price;

	public Integer getCar_Id() {
		return car_Id;
	}

	public void setCar_Id(Integer car_Id) {
		this.car_Id = car_Id;
	}

	public String getCar_Name() {
		return car_Name;
	}

	public void setCar_Name(String car_Name) {
		this.car_Name = car_Name;
	}

	public String getCar_Model() {
		return car_Model;
	}

	public void setCar_Model(String car_Model) {
		this.car_Model = car_Model;
	}

	public String getCar_Company() {
		return car_Company;
	}

	public void setCar_Company(String car_Company) {
		this.car_Company = car_Company;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	

}
