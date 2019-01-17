package com.homework;

public class Car {
	private String type;
	private String plate;
	private String color;
	private float weight;

	public void start() {
		System.out.println("Car Start");
	}

	public void accelerate() {
		System.out.println("Car  accelerate");
	}

	public void brake() {
		System.out.println("Car brake");
	}

	public static void main(String[] args) {
		Car car = new Car();
		car.start();
		car.accelerate();
		car.brake();
	}
}
