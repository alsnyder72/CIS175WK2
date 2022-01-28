package model;

/**
 * @author AlSnyder - asnyder7
 * CIS175 - SPRING 2022
 * Jan 27, 2022
 */

public class Vehicle {
	private String make;
	private String model;
	private double price;
	private int age;
	
	public Vehicle() {
		super();
	}

	public Vehicle(String make, String model) {
		super();
		this.make = make;
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", price=" + price + ", age=" + age + "]";
	}
	
	
	
	
}
