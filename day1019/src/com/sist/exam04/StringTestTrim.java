package com.sist.exam04;

public class StringTestTrim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String data = "   java   ";
		int n = data.length();	//���鵵 ���
		System.out.println(n);	//10
		
		String data2 = data.trim();
		int n2 = data2.length();
		System.out.println(n2);	//4
		System.out.println("|"+data+"|");
		System.out.println("|"+data2+"|");
		
		data = data.trim();
		System.out.println("|"+data+"|");
	}

}
