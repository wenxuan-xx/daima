package cn.java;

public class Test02 {
	public static void main(String[] args) {
		Persona p = new Persona();
		System.out.println(p.test());
	}
}
class Persona{
	int a = 10;
	// ��ͨ��Դ
	public int test() {
		int a = 10 ;
		return a ;
	}
	// ��̬��Դ
	static public void test2() {
		int a = 15 ;
		System.out.println(a);
	}
	static public void test3() {
		test2();
	}
}
