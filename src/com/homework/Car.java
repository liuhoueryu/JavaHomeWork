package com.homework;

import java.util.Scanner;

public class Car {
	private String type;
	private String plate;
	private String color;
	private float weight;
	Scanner sc = new Scanner(System.in);

	public void start() {
		System.out.println("car Start");
	}

	public void accelerate() {
		System.out.println("car Accelerate");
	}

	public void brake() {
		System.out.println("car Brake");
	}

	public void setColor() {
		System.out.println("Please choose the color of the car:");
		String color = sc.nextLine();
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}

	public void showColor() {
		System.out.println("car is " + getColor());
	}

	public void setType() {
		System.out.println("Please choose the type of the car:");
		String type = sc.nextLine();
		this.type = type;
	}

	public String getType() {
		return this.type;
	}

	public void showType() {
		System.out.println("car is " + getType());
	}

	public void setWeight() {
		System.out.println("Please set the weight of the car:");
		float weight = sc.nextFloat();
		this.weight = weight;
	}

	public float getWeight() {
		return this.weight;
	}

	public void showWeight() {
		System.out.println("car is " + getWeight() + "t");
	}

	public void setPlate() {
		System.out.println("Please choose the plate of the car:");
		String plate = sc.nextLine();
		this.plate = plate;
	}

	public String getPlate() {
		return this.plate;
	}

	public void showPlate() {
		System.out.println("car is " + getPlate());
	}

	public static void initCar() {
		Car car = new Car();
		car.setColor();
		car.toString();
		car.setType();
		car.setPlate();
		car.setWeight();
		car.showColor();
		car.showType();
		car.showPlate();
		car.showWeight();
		car.start();
		car.accelerate();
		car.brake();
		car.getPlate();
	}

	public static void main(String[] args) {
		initCar();
	}

}
