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
				
		System.out.print("�̸��� �Է��ϼ���==>");
		name = sc.next();
		System.out.print("�ֹι�ȣ�� �Է��ϼ���==>");
		number = sc.next();
		
		int year = Integer.parseInt(number.substring(0,2)); 
		int a = Integer.parseInt(number.substring(7, 8));
		
		if(a==1 || a==2) {
			year += 1900;
		}else if(a==3 || a==4) {
			year += 2000;
		}
		
		age = thisyear - year + 1;
		
		
		String base = "����,����";
		if(age>=40 && thisyear%2 == year%2) {
			if(a==1) {
				base = base;
			}else{
				base = base + ",�����,�ڱþ�";
			}
			System.out.printf("%s���� %d�⵵ ����ϰ��� ������̸�\n�����׸��� %s�Դϴ�.",name,thisyear,base);
		}else if(age>=50 && thisyear%2 == year%2) {
			if(a==1) {
				base = base + ",�����";
			}else if(a==2) {
				base = base + ",�����,�����,�ڱþ�";
			}
			System.out.printf("%s���� %d�⵵ ����ϰ��� ������̸�\n�����׸��� %s�Դϴ�.",name,thisyear,base);
		}
		
		
	}

}
