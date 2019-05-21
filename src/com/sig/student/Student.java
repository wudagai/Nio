package com.sig.student;


public class Student {
	/*1、提供一个私有有构造器
	2、提供一个私有的对象自身类型的静态属性
	3、提供一个公共的静态的返回值为对象自身的方法；（全局访问点）*/
	private Student(){
		System.out.println("我被实例化了");
	}
	//懒汉式
/*	private static Student student;
	public static Student getInstance() {
		if(student==null) {
			student=new Student();
		}
		return student;
	}*/
	//饿汉式
	private static Student student=new Student();
	public static Student getInstance() {
		return student;
	}
}
