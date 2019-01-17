package com.homework;

import java.util.Scanner;

public class Car {
	private String type;
	private String plate;
	private String color;
	private float weight;
	Scanner sc = new Scanner(System.in);

	public void start() {
		System.out.println("Car Start");
	}

	public void accelerate() {
		System.out.println("Car Accelerate");
	}

	public void brake() {
		System.out.println("Car Brake");
	}

	public void setColor() {
		System.out.println("Please choose the color of the car:");
		String color = sc.nextLine();
		this.color = color;
	}

	public void showColor() {
		System.out.println("car is " + this.color);
	}

	public void setType() {
		System.out.println("Please choose the type of the car:");
		String type = sc.nextLine();
		this.type = type;
	}

	public void showType() {
		System.out.println("car is " + this.type);
	}

	public void setWeight() {
		System.out.println("Please set the weight of the car:");
		float weight = sc.nextFloat();
		this.weight = weight;
	}

	public void showWeight() {
		System.out.println("car is " + this.weight+"t");
	}

	public void setPlate() {
		System.out.println("Please choose the plate of the car:");
		String plate = sc.nextLine();
		this.plate = plate;
	}

	public void showPlate() {
		System.out.println("car is " + this.plate);
	}

	public static void main(String[] args) {
		Car car = new Car();
		HumanBeings per =new HumanBeings();
		car.setColor();
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
		per.eating();
		per.working();
		per.sleeping();
	}

}
