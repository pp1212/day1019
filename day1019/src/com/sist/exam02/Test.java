package com.sist.exam02;

public class Test {
	/*
	public static void drawAll(GameCharacter []array) {
		for(GameCharacter character :array) {
			character.draw();
			((Hobitt)character).getRing();
		}
	}
	�����߻� => �迭�ȿ��� ȣ���� �ְ� Ÿ��ź�� �ְ� �ּ��絵 �ִµ�
	������� ȣ������ ����ȯ �߱� ������ ���� �߻�
	ȣ������ ����� ����ȯ �ؾ� ��
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
	//Object�� GameCharacter�� ��Ӱ���� ������ ���������� 
	//�ڽ�Ŭ������ GameCharacter���� ������� draw�޼ҵ� �θ� �� ����
	//����ȯ �ؾ� ��
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GameCharacter g1 = new Hobitt();
		//is a ���迡 ���� �� �θ��� ���������� �ڽ�Ŭ������ ��ü�� ���� ����
		
		g1.getLife();
		//��ü�� �޼����� ������ �ڽ��� Ŭ�������� ���� ã��
		//������ �θ�Ŭ������ �޼ҵ尡 ����
		
		//g1.getRing();
		//���� �߻�
		//is a ���迡 ���� ��
		//�θ��� ���������� �ڽ�Ŭ������ ��ü ���� �� �� ������
		//�ڽ�Ŭ������ ���Ӱ� �߰��� �޼ҵ带 �ٷ� ȣ�� �� �� ����
		
		((Hobitt)g1).getRing();
		//is a ���迡 ���� ��
		//�θ��� ���������� �ڽ�Ŭ������ ��ü�� ������ ��
		//�ڽ�Ŭ�������� ���Ӱ� �߰��� �޼ҵ带 ȣ���Ϸ��� �� �ڽ�Ŭ������ 
		//����ȯ �� ȣ���� �� ����
		
		
		System.out.println("=====================================");
		
		
		/*
		GameCharacter []array = new GameCharacter[6];
		array[0] = new Hobitt();
		array[1] = new Hobitt();
		array[2] = new Titan();
		array[3] = new Titan();
		array[4] = new Sorcerer();
		array[5] = new Sorcerer();
		�ؿ��� ����*/
			
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
