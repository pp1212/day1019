package com.sist.exam01;

public interface Movable {
	int speed = 100;
	//final ���� -> ����� �ʱⰪ�� �;� ��
	
	public abstract void speedUp(int amount);
	public abstract void speedDown(int amount);
	
	/*
	public void printSpeed() {
		System.out.println("����ӵ�:"+speed);
	}
	�������̽����� body�� ��üȭ�� �޼ҵ� �� �� ����*/
}
