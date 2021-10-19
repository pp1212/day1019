package com.sist.exam01;

public interface Movable {
	int speed = 100;
	//final 생략 -> 상수라서 초기값이 와야 함
	
	public abstract void speedUp(int amount);
	public abstract void speedDown(int amount);
	
	/*
	public void printSpeed() {
		System.out.println("현재속도:"+speed);
	}
	인터페이스에는 body가 구체화된 메소드 올 수 없음*/
}
