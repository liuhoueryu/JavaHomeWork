package com.homework;

public class Main {

	public static void main(String[] args) {
		Point point=new Point();
		Circle circle=new Circle();
		circle.initCircle();
		//Car car=new Car();
		//car.initCar();
		System.out.println(point.toString());
		point.move(10, 24);
		System.out.println(point.toString());
		System.out.println("the distance is: "+point.distance(point));
		System.out.println("the Area is: "+circle.getArea()+"\nthe Length is: "+circle.getLength());
		System.out.println(circle.contains(point)+" to contain");
	}

}
