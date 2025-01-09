package com.prowings;

public class Traveller {

//	Car car = new Car();
//	Bike bike = new Bike();
//	Bus bus = new Bus();

	Vehicle vehicle;

	public Traveller() {
		super();
	}

	public Traveller(Vehicle vehicle) {
		super();
		this.vehicle = vehicle;
	}

	public void StartJourney() {
//		car.move();
//		bike.move();
//		bus.move();

		vehicle.move();

//		System.out.println("traveller started journey with car");
//		System.out.println("traveller started journey with bike");
//		System.out.println("traveller started journey with bus");

		System.out.println("traveller started journey with vehicle");
	}

}
