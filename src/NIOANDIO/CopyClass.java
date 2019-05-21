package NIOANDIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class CopyClass {

	public static void main(String[] args) {
		File a=new File("C:\\Users\\wyh\\Desktop\\a.txt");
		File b=new File("C:\\Users\\wyh\\Desktop\\b.txt");
		FileInputStream in=null;
		FileOutputStream ou=null;
		FileChannel inChannel=null;
		FileChannel ouChannel=null;
		
		try {
			in=new FileInputStream(a);
			 ou=new FileOutputStream(b);
			//获取通道channer
			 inChannel=in.getChannel();
			 FileChannel inChannel1=in.getChannel();
			 ouChannel=ou.getChannel();
			
			//获取缓冲区buffer
			ByteBuffer buffer=ByteBuffer.allocate(1024);
			
			while(true) {
				int num=inChannel.read(buffer);
				if(num==-1) {
					break;
				}
				//释放buffer资源
				buffer.flip();	
				
				ouChannel.write(buffer);
				//释放buffer资源
				buffer.clear();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				in.close();
				ou.close();
				inChannel.close();
				ouChannel.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

	}

}
