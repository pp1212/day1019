package com.sist.exam04;

public class StringBufferTest {
	
	
	public static void pro(String str) {
		System.out.println("ó���ϴ� ���ڿ��� "+str+"�Դϴ�.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer data = new StringBuffer("hello");	//A
		data.append("korea");							//B
		
		System.out.println(data);
		
		//A�� data�� B�� data�� ���� �޸𸮸� ����
		//StringBuffer�� ������ �ٲٴ��� ���ο� �޸𸮸� ������ �ʰ�
		//���� ��ü�� ������ �����
		//���� ���ϴ� ���ڿ� ó������ StringBuffer,StringBuilder�� ���
		
		//�׷��� ���� �̷��� ó���� StringBuffer�� �Ű������� �����Ͽ�
		//� �޼ҵ带 ����� ���� �ٽ� String���� ��ȯ�ؾ� �ϴ� ��� ����
		//���ڿ��� �Ű������� �޾� ó���ϴ� ��κ��� �޼ҵ�� String �޵��� �Ǿ� �ִ� ���� �Ϲ���
		
		
		//pro(data);
		//pro�޼ҵ�� String�� �Ű������� ���� ������ StringBuffer�� ���� �Ұ�
		
		//�̿� ���� ��� �޼ҵ带 ȣ���ϱ� ���Ͽ�
		//StringBuffer�� String���� �ٲپ�� �ϴ� ��� ����
		//�̸� ���Ͽ� String�� ������ �߿� StringBuffer�� �Ű������� ���� ������ �̿�
		pro(  new String(data)  );
		//���� ��ɾ�� ������ ���� 2���� ��ɾ�� ǥ�� ����
		//�ؿ��� ���� (�ؿ��� ��� ����� ��)
		String r = new String(data);
		pro(r);
	}

}
