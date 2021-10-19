package com.sist.exam02;

public class Test {
	/*
	public static void drawAll(GameCharacter []array) {
		for(GameCharacter character :array) {
			character.draw();
			((Hobitt)character).getRing();
		}
	}
	오류발생 => 배열안에는 호빗도 있고 타이탄도 있고 주술사도 있는데
	덮어놓고 호빗으로 형변환 했기 때문에 오류 발생
	호빗인지 물어보고 형변환 해야 함
	*/
	
	
	public static void drawAll(GameCharacter []array) {
		for(GameCharacter character :array) {
			character.draw();
			if(character instanceof Hobitt) {
				((Hobitt)character).getRing();
			}
		}
	}
	
	
	
	
	
	
	
	/*
	public static void drawAll(Object []array) {
		for(Object character :array) {
			((GameCharacter)character).draw();
		}
	}*/
	//Object와 GameCharacter는 상속관계라서 참조는 가능하지만 
	//자식클래스인 GameCharacter에서 만들어진 draw메소드 부를 수 없음
	//형변환 해야 함
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GameCharacter g1 = new Hobitt();
		//is a 관계에 있을 때 부모의 참조변수가 자식클래스의 객체를 참조 가능
		
		g1.getLife();
		//객체가 메세지를 받으면 자신의 클래스에서 먼저 찾고
		//없으면 부모클래스의 메소드가 동작
		
		//g1.getRing();
		//오류 발생
		//is a 관계에 있을 때
		//부모의 참조변수가 자식클래스의 객체 참조 할 수 있지만
		//자식클래스에 새롭게 추가한 메소드를 바로 호출 할 수 없음
		
		((Hobitt)g1).getRing();
		//is a 관계에 있을 때
		//부모의 참조변수가 자식클래스의 객체를 참조할 때
		//자식클래스에서 새롭게 추가한 메소드를 호출하려면 그 자식클래스로 
		//형변환 후 호출할 수 있음
		
		
		System.out.println("=====================================");
		
		
		/*
		GameCharacter []array = new GameCharacter[6];
		array[0] = new Hobitt();
		array[1] = new Hobitt();
		array[2] = new Titan();
		array[3] = new Titan();
		array[4] = new Sorcerer();
		array[5] = new Sorcerer();
		밑에랑 같은*/
			
		GameCharacter []array = {
				new Hobitt(),
				new Hobitt(),
				new Titan(), 
				new Titan(), 
				new Sorcerer(),
				new Sorcerer()
		};
		/*
		for(GameCharacter character :array) {
			character.draw();
		}*/
		drawAll(array);
		
		
	}

}
