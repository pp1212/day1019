package com.sist.exam04;

public class StringBufferTest {
	
	
	public static void pro(String str) {
		System.out.println("처리하는 문자열은 "+str+"입니다.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer data = new StringBuffer("hello");	//A
		data.append("korea");							//B
		
		System.out.println(data);
		
		//A의 data와 B의 data는 같은 메모리를 참조
		//StringBuffer의 내용을 바꾸더라도 새로운 메모리를 만들지 않고
		//기존 객체의 내용이 변경됨
		//따라서 변하는 문자열 처리에는 StringBuffer,StringBuilder를 사용
		
		//그런데 만약 이렇게 처리된 StringBuffer를 매개변수로 전달하여
		//어떤 메소드를 사용할 때는 다시 String으로 변환해야 하는 경우 많음
		//문자열을 매개변수로 받아 처리하는 대부분의 메소드는 String 받도록 되어 있는 것이 일반적
		
		
		//pro(data);
		//pro메소드는 String을 매개변수로 갖기 때문에 StringBuffer를 전달 불가
		
		//이와 같이 어떠한 메소드를 호출하기 위하여
		//StringBuffer를 String으로 바꾸어야 하는 경우 많음
		//이를 위하여 String의 생성자 중에 StringBuffer를 매개변수로 갖는 생성자 이용
		pro(  new String(data)  );
		//위의 명령어는 다음과 같이 2개의 명령어로 표현 가능
		//밑에랑 같음 (밑에는 계속 사용할 때)
		String r = new String(data);
		pro(r);
	}

}
