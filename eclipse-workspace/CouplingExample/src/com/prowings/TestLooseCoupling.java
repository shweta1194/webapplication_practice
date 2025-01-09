package com.prowings;

public class TestLooseCoupling {

	public static void main(String[] args) {

//		Car car = new Car();
//		Bike bike = new Bike();
		Bus bus = new Bus();

//		Traveller traveller = new Traveller(car);
//		Traveller traveller = new Traveller(bike);
		Traveller traveller = new Traveller(bus);

		traveller.StartJourney();
	}

}
