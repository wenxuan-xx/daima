package cn.java;
// ¼Ì³Ð Random
import java.util.Random;

public class Test {
	public static void main(String[] args) {
		cool p = new cool();
		int a = p.nextInt();
		System.out.println(a);
		p.crize();
	}
}

class cool extends Random{
	
	public int nextInt() {  // @Override//×¢½â
		super.nextDouble();// ÕÒ nextIntÖÐ 
		return (100);
		 
	}
	public void crize() {
	}
}
