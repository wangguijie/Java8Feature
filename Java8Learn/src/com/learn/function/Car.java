package com.learn.function;

public class Car {
	
	
	private int mID = 0;

	public Car(int id) {
		mID = id;
	}
	// Supplier��jdk1.8�Ľӿڣ������lamdaһ��ʹ����
	public static Car create(final Supplier<Car> supplier) {
		return supplier.get();
	}



	public static Car create() {
		return new Car(0);
	}

	public static void collide(final Car car) {
		System.out.println("Collided " + car.toString());
	}

	public void follow(final Car another) {
		System.out.println("Following the " + mID + " another id : " + another.getID());
	}

	private int getID() {
		return mID;
	}

	public void repair() {
		System.out.println("Repaired " + this.getID());
	}
}