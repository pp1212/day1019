package com.sist.exam05;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String correct_id = "tiger";
		String correct_pw = "tiger1234";
		
		
		Scanner sc = new Scanner(System.in);
		String input_id, input_pw;
		System.out.print("아이디를 입력하세요==>");
		input_id = sc.next();
		System.out.print("암호를 입력하세요==>");
		input_pw = sc.next();
		
		if(correct_id.equals(input_id) && correct_pw.equals(input_pw)) {
			System.out.println("로그인에 성공하였습니다.");
		}else {
			System.out.println("로그인에 실패하였습니다.");
		}
		
	}

}
