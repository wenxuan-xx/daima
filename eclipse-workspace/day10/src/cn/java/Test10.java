package cn.java;

import java.io.IOException;
import java.io.InputStream;

public class Test10{
	public static void main(String[] args) {
		try {
			InputStream i = new Test9();
			i.read();
			System.out.println("yeas");
		}catch(Exception a) {
			System.out.println("Ö´ÐÐ´íÎó");
		}
	}
}
class Test9 extends InputStream{

	@Override
	public int read() throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}
	
}