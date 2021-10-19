package com.sist.exam04;

public class StringTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data = new String("hello");	//A
		data = data + "korea";				//B
		//원래 있던게 변하는게 아니라 새로운 메모리가 잡히는 것
		
		System.out.println(data);
		//A에서 data가 참조하는 객체와
		//B에서 data가 참조하는 객체는 다름
		//String의 내용을 변경시키면 새로운 메모리를 잡음
		//그래서 String의 데이터를 변경시킬 때마다 가비지가 생김
		//따라서 변하는 문자열 처리에는 String이 적합하지 않음
		//변하는 문자열 처리를 위해서는 StringBuffer,StringBuilder 이용
	}

}
