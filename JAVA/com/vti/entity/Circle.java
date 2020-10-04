package com.vti.entity;

public class Circle {
	private double radius;
	private String color;
	private final double PI = 3.14;
	Circle () {
	}
	

	public Circle(double radlus) {
		super();
		this.radius = radlus;
	}


	public Circle(double radlus, String color) {
		super();
		this.radius = radlus;
		this.color = color;
	}


	public double getRadlus() {
		return radius;
	}


	public void setRadlus(double radlus) {
		this.radius = radlus;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	public double getArea() {
		return PI * Math.pow(radius, 2.0);
	}


	
	public String toString() {
		return "Circle [radius=" + radius + ", \ncolor=" + color + "]";
	}
	
	
}