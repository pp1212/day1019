package com.sist.exam04;

public class StringTest06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data1 = new String("홍길동");	//new붙으면 새로 생기는 것
		String data2 = new String("홍길동");	//new붙으면 새로 생기는 것
		
		/*
		if(data1 == data2) {			//같은 곳을 가리키냐고 묻는 것
			System.out.println("서로 같아요");
		}else {
			System.out.println("서로 달라요");
		}
		*/
		
		if(data1.equals(data2)) {		//같은 값을 갖고 있냐고 묻는 것
			System.out.println("서로 같아요");
		}else {
			System.out.println("서로 달라요");
		}
		
		System.out.println("=========================");
		String name1 = new String("tiger");
		String name2 = new String("Tiger");
		
		if(name1.equals(name2)) {
			System.out.println("이름이 tiger로 같아요");
		}else {
			System.out.println("이름이 같지 않아요");
		}
		//equals는 대소문자 구별
		
		System.out.println("=========================");
		if(name1.equalsIgnoreCase(name2)) {
			System.out.println("이름이 tiger로 같아요");
		}else {
			System.out.println("이름이 같지 않아요");
		}
		//equalsIgnoreCase는 대소문자 구별하지 않고 같은지 판별
	}

}
