package com.sist.homework02;

import java.util.Scanner;

public class ResidentRegistrationNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String number;
		System.out.print("�ֹι�ȣ�� �Է��ϼ���==>");
		number = sc.next();
		
		if(number.substring(7, 8) != "1" || number.substring(7, 8) != "2" || number.substring(7, 8) != "3" || number.substring(7, 8) != "4") {
			System.out.println("�߸��� �ֹι�ȣ�Դϴ�.");
		}else {
			
		}
	}

}
