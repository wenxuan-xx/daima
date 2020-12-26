package cn.java;

public class Test02 {
	public static void main(String[] args) {
		Persona p = new Persona();
		System.out.println(p.test());
	}
}
class Persona{
	int a = 10;
	// 普通资源
	public int test() {
		int a = 10 ;
		return a ;
	}
	// 静态资源
	static public void test2() {
		int a = 15 ;
		System.out.println(a);
	}
	static public void test3() {
		test2();
	}
}
