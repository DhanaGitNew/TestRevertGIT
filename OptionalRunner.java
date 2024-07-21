package com.collections;

import java.util.Optional;

public class OptionalRunner {

	public static void main(String[] args) {

		Performance p1 = new Performance();
		p1.setIsperform(true);
		Car car = new Car("INDICA", "TATA", new Diesel(90, 10), new Petrol(85, 19, p1));
		Car car1 = new Car("WAGANOR", "MARUTI", new Diesel(90, 23), new Petrol(85, 34, p1));
		if (null != car) {
			if (car.getPetrol() != null) {
				if (car.getPetrol().get().getPerfomance() != null) {
					//System.out.println(car.getPetrol().get().getPerfomance().isPresent());
				}

			}
		}
		
		//String str= Optional.ofNullable("Hi").orElse("Hello");
		
		Optional<Car> optCar= Optional.ofNullable(car);
		Optional<Boolean> b=optCar.flatMap(Car::getPetrol).flatMap(Petrol::getPerfomance).map(x->x.isIsperform());
		
		 Optional<Optional<Petrol>> prt=optCar.map(c->c.getPetrol());
		 Optional<Petrol> perfomance= prt.get();
		 Petrol p3= perfomance.get();
		 Optional<Performance> pfg= p3.getPerfomance();
		 //System.out.println(pfg.get().isIsperform());
		 
		 // Functions in Optional class
		 
		 Optional<String> opt1=Optional.empty();
		 System.out.println(opt1.isPresent());
		 
		 
		 System.out.println(opt1.isPresent());
		 opt1.ifPresent(x->System.out.println("HI"));
		 
		 Optional<String> opt2=Optional.of("Available");
		 opt2.ifPresent(x->System.out.println("HI"));
		 
		 String val=Optional.of("Greet").orElse("New Greet");
		 System.out.println(val);
		 String val1=(String) Optional.ofNullable(null).orElse("New Greet");
		 System.out.println(val1);
		 
		 String z="Hi";
		 z=null;
		 String cd= Optional.ofNullable(z).orElseGet(()->"DHana");
		 System.out.println(cd);
		 
		 
	}
}
