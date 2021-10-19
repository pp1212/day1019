package com.sist.exam04;

import java.util.Scanner;
public class StringTestIndexOf02 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이메일을 입력하세요==>");
		String email = sc.next();
		
		if(int index = email.indexOf("@")) {
			System.out.println(index);
		}
		
	}

}
