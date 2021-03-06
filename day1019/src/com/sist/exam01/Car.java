package com.sist.exam01;

public class Car implements Movable {

	private String name;
	private String color;
	public Car(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + "]";
	}

	@Override
	public void speedUp(int amount) {
		// TODO Auto-generated method stub
		System.out.println(amount +"만큼 속도를 올립니다.");
	}

	@Override
	public void speedDown(int amount) {
		// TODO Auto-generated method stub
		System.out.println(amount +"만큼 속도를 내립니다.");
	}
	public void turnLeft() {
		System.out.println("좌회전합니다.");
	}
	public void turnRight() {
		System.out.println("우회전합니다.");
	}
}
