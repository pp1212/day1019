package com.sist.exam05;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String sentence;
		int cnt=0;
		System.out.print("문장을 입력하세요==>");
		sentence = sc.next();
		
		for(int i=0;i<sentence.length();i++) {
			sentence.indexOf("o")
			cnt++;
		}
	}

}
