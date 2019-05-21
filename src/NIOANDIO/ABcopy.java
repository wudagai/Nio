package NIOANDIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ABcopy {

	public static void main(String[] args) {
		File a=new File("C:\\Users\\wyh\\Desktop\\a.txt");
		File b=new File("C:\\Users\\wyh\\Desktop\\b.txt");
		FileInputStream in=null;
		FileOutputStream on=null;
		FileChannel inChannel=null;
		FileChannel onChannel=null;
		
		try {
			in=new FileInputStream(a);
			on=new FileOutputStream(b);
			//��ô���ͨ��channel
			inChannel=in.getChannel();
			onChannel=on.getChannel();
			//��ȡbuffer����
			ByteBuffer buffer=ByteBuffer.allocate(1024);
			
			while(true) {
				int num=inChannel.read(buffer);
				if(num==-1) {
					break;
				}
				//����һ��buffer��position=0��limit=position
				buffer.flip();
				onChannel.write(buffer);
				//д��Ҫ����buffer������position=0,limit=capacity
				buffer.clear();
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			 try {
				inChannel.close();
				onChannel.close();
	            in.close();
	            on.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		}
		
		

	}

}
