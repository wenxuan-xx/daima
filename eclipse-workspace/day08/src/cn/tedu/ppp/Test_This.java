package cn.tedu.ppp;

public class Test_This {
	public static void main(String[] args) {
		new Person();
		
	}
}
class Person{
	// 当 成员变量 和 局部变量同名时,使用this 
	int a = 20;
	int k;
	String name;
	public void Person() {
		int a = 10;
		Person p = new Person();
		// p 就相当于this,自动生成 : Person this = new Person
		// 1, 当同名的成员变量和局部变量同名时,用 this. 调用成员变量
		System.out.println(p.a);
	}
}