package com.sist.exam04;

public class StringTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data = new String("hello");	//A
		data = data + "korea";				//B
		//���� �ִ��� ���ϴ°� �ƴ϶� ���ο� �޸𸮰� ������ ��
		
		System.out.println(data);
		//A���� data�� �����ϴ� ��ü��
		//B���� data�� �����ϴ� ��ü�� �ٸ�
		//String�� ������ �����Ű�� ���ο� �޸𸮸� ����
		//�׷��� String�� �����͸� �����ų ������ �������� ����
		//���� ���ϴ� ���ڿ� ó������ String�� �������� ����
		//���ϴ� ���ڿ� ó���� ���ؼ��� StringBuffer,StringBuilder �̿�
	}

}
