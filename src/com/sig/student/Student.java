package com.sig.student;


public class Student {
	/*1���ṩһ��˽���й�����
	2���ṩһ��˽�еĶ����������͵ľ�̬����
	3���ṩһ�������ľ�̬�ķ���ֵΪ��������ķ�������ȫ�ַ��ʵ㣩*/
	private Student(){
		System.out.println("�ұ�ʵ������");
	}
	//����ʽ
/*	private static Student student;
	public static Student getInstance() {
		if(student==null) {
			student=new Student();
		}
		return student;
	}*/
	//����ʽ
	private static Student student=new Student();
	public static Student getInstance() {
		return student;
	}
}
