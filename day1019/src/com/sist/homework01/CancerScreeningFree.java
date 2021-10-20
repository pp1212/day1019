package com.sist.homework01;

import java.util.Date;
import java.util.Scanner;

public class CancerScreeningFree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Date today = new Date();
		String name,number;
		int thisyear,age;
		thisyear = today.getYear() + 1900; 
				
		System.out.print("이름을 입력하세요==>");
		name = sc.next();
		System.out.print("주민번호를 입력하세요==>");
		number = sc.next();
		
		int year = Integer.parseInt(number.substring(0,2)); 
		int a = Integer.parseInt(number.substring(7, 8));
		
		if(a==1 || a==2) {
			year += 1900;
		}else if(a==3 || a==4) {
			year += 2000;
		}
		
		age = thisyear - year + 1;
		
		
		String base = "위암,간암";
		if(age>=40 && thisyear%2 == year%2) {
			if(a==1) {
				base = base;
			}else{
				base = base + ",유방암,자궁암";
			}
			System.out.printf("%s님은 %d년도 무료암검진 대상자이며\n검진항목은 %s입니다.",name,thisyear,base);
		}else if(age>=50 && thisyear%2 == year%2) {
			if(a==1) {
				base = base + ",대장암";
			}else if(a==2) {
				base = base + ",대장암,유방암,자궁암";
			}
			System.out.printf("%s님은 %d년도 무료암검진 대상자이며\n검진항목은 %s입니다.",name,thisyear,base);
		}
		
		
	}

}
