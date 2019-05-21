package com.sig.student;

import java.util.Arrays;

public class TestStudent {

	public static void main(String[] args) {
		/*Student student=new Student();
		Student student2=new Student();*/	
		/*Student student=Student.getInstance();
		Student student2=Student.getInstance();
		System.out.println(student==student2);*/
		int [] a=new int[] {1,2,3,1,77,6,99,5,11};
		for(int i=0;i<a.length;i++) {	
			for(int j=0;j<a.length-1;j++) {
			if(a[j]>a[j+1]) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				
			}
		}
	}
		System.out.println(Arrays.toString(a));
		int [] b=new int[] {9,90,3,1,77,6,99,5,11};	
		for(int i=1;i<b.length+1;i++) {
			for(int j=0;j<b.length-i;j++) {
				if(b[j]>b[j+1]) {
					int temp=b[j];
					b[j]=b[j+1];
					b[j+1]=temp;
					
				}
				
			}
		}
		System.out.println(Arrays.toString(b));
 }

}
