package com.scollay.test;

public class Car {
	private String make, registration;
	private int year, topSpeed;

	public Car(String make, String registration, int year, int topSpeed) {
		this.make = make;
		this.registration = registration;
		this.year = year;
		this.topSpeed = topSpeed;
	}

	public void giveInfo() {
		System.out.println("Make:\t" + this.make + "\nRegistration:\t"
				+ this.registration + "\nYear:\t" + this.year
				+ "\nTop Speed:\t" + this.topSpeed + "\n");
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

}
