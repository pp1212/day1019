package com.sist.exam05;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String email;
		System.out.print("�̸����� �Է��ϼ���==>");
		email = sc.next();
		
		int i = email.indexOf("@");
		String j = email.substring(0,i);
		System.out.println("���̵�� "+j+"�Դϴ�.");
		
	}

}
