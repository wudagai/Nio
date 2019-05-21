package NIOANDIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyIo {

	public static void main(String[] args) {
		File resouce=new File("C:\\Users\\wyh\\Desktop\\abc.txt");
		if(!resouce.exists()) {
			try {
				resouce.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		BufferedReader bfff=null;
		try {
			bfff=new BufferedReader(new FileReader(resouce));
			String line1=bfff.readLine();
			String line2=bfff.readLine();
			String line3=bfff.readLine();
			String line4=bfff.readLine();
			
			System.out.println(line4);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
	}

}
