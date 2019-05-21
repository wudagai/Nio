package com.sig.student;

public class TestEquals {

	public static void main(String[] args) {
			
		String s1 = "china";
		Object s2 = "china";
		Object s3 = "china";
		Object ss1 = new String("china");
		Object ss2 = new String("china");
		Object ss3 = new String("china");  
		System.out.println(ss1.equals(ss2));
		System.out.println(s1==s3);
	}

}
