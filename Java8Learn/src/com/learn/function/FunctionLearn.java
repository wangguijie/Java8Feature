package com.learn.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FunctionLearn {
	public static void main(String[] args) {
		final Car car = new Car(1);
		final List< Car > cars = Arrays.asList( car );
		cars.forEach( Car::collide );
//		final Car another = Car.create( Car::new );
		final Car another = new Car(2);
		cars.forEach(Car::repair);
		
		cars.forEach(nu -> nu.follow(another));
		cars.forEach(nu -> {
				another.follow(nu) ; 
				nu.follow(another);
			});
		
//		for(Car c : cars) {
//			another.follow(c);
//		}
	}
}
