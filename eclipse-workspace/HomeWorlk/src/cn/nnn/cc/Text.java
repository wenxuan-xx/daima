package cn.nnn.cc;

import java.util.Scanner;

public class Text {
	public static void main(String[] args) {
		Dbthon d1 = new Dbthon();
		Dbthon2 d2 = new Dbthon2();
		int i = d1.a>d2.a?d1.a:d2.a;
		System.out.println(i);
	}
}
class Dbthon{
	int a = new Scanner(System.in).nextInt();
	
}
 
class Dbthon2{
	int a = new Scanner(System.in).nextInt();

	
}
	
