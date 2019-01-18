package com.homework;

public class Circle {
	private Point center = new Point();
	private double radius;
	final double pi = 3.14;

	public Point getCenter() {
		return center;
	}

	public void setCenter(int x, int y) {
		center.setX(x);
		center.setY(y);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return Math.pow(this.radius, 2) * pi;
	}

	public double getLength() {
		return this.radius * pi * 2;
	}

	public Boolean contains(Point point) {
		if (point.distance(point) > this.radius)
			return false;
		else
			return true;
	}

	public void initCircle() {
		this.setCenter(10, 10);
		this.setRadius(6);
	}
}
