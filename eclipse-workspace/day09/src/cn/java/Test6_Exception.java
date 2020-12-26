package cn.java;

import java.util.Scanner;

public class Test6_Exception {
	public static void main(String[] args) {
		// method(3, 1);
		//mathod2();
		//method3(); // 调用有异常的方法要么捕获,要么抛出
	}

	private static void method3() throws Exception{	
			int c = new Scanner(System.in).nextInt();
			int d = new Scanner(System.in).nextInt();
			System.out.println(c/d);	
	}

	private static void mathod2() {
		try {
			int a = new Scanner(System.in).nextInt();
			int b = new Scanner(System.in).nextInt();
			System.out.println(a / b);
		} catch (Exception m) { // 多态
			System.out.println("请输入两个有效数据");
		} 
	}
}