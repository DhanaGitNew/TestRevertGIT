package com.collections;

import java.util.Optional;

public class Car {
	
	private String carName;
	private String carMaking;
	private Optional<Diesel> diesel;
	private Optional<Petrol> petrol;
	public Car(String carName, String carMaking, Diesel diesel, Petrol petrol) {
		super();
		this.carName = carName;
		this.carMaking = carMaking;
		this.diesel = Optional.ofNullable(diesel);
		this.petrol = Optional.ofNullable(petrol);
	}
	public String getCarName() {
		return carName;
	}
	public String getCarMaking() {
		return carMaking;
	}
	public Optional<Diesel> getDiesel() {
		return diesel;
	}
	public Optional<Petrol> getPetrol() {
		return petrol;
	}
	
	
	
	

}
