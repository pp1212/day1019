package com.sist.exam04;

public class StringTestsubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data = "abcdefghijklmn";
		String data2 = data.substring(3,8);	//defgh
		String data3 = data.substring(8);	//ijklmn
		
		System.out.println(data2);
		System.out.println(data3);
		
		String url = "https://docs.oracle.com/javase/8/docs/api/index.html";
		
		System.out.println(  url.substring(   url.lastIndexOf("/")+1   )   );
		//같은 결과
		int i = url.lastIndexOf("/")+1;
		String cmd = url.substring(i);
		System.out.println(cmd);
		
	}

}
