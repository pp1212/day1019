package com.sist.exam05;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String correct_id = "tiger";
		String correct_pw = "tiger1234";
		
		
		Scanner sc = new Scanner(System.in);
		String input_id, input_pw;
		System.out.print("���̵� �Է��ϼ���==>");
		input_id = sc.next();
		System.out.print("��ȣ�� �Է��ϼ���==>");
		input_pw = sc.next();
		
		if(correct_id.equals(input_id) && correct_pw.equals(input_pw)) {
			System.out.println("�α��ο� �����Ͽ����ϴ�.");
		}else {
			System.out.println("�α��ο� �����Ͽ����ϴ�.");
		}
		
	}

}
