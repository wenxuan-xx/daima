package cn.java;
// 测试  static
public class Test1_Static {
	public static void main(String[] args) {
		// TODO 创建对象测试
		Person a = new Person();
		a.test();
		a.code();// 静态资源不建议通过对象访问
		System.out.println(a.a);
		System.out.println(a.name);
		Person.code();// 静态资源可以直接通过类名调用
		System.out.println(Person.name);// 通过类名直接调用类里静态资源的属性
		// 全局共享 
		Person a2 = new Person();
		Person a3 = new Person();
		a2.name = "luo";
		System.out.println(a3.name);
		kuu x = new kuu();
		x.code();
		
	}
}

class Person {
	// 普通资源 -- new了才开辟内存空间,只能通过对象调取
	static int a = 10;
	public void test() {
		// 普通资源调用静态资源,可以直接调用
		code();
		System.out.println(name);
		System.out.println("普通资源");
	}

	// 静态资源 -- 随着类的加载而加载
	static String name = "jack";// 普通方法加 static
	static public void code() {
		// 静态资源不能调用普通资源,静态资源只能调用静态资源
		// System.out.println(a);
		System.out.println("code..");
	}
}
class kuu extends Person{
	static public void code() {//static 的方法可以被调用,不能被重写
		System.out.println("重写了");
	}
}
