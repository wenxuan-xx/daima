package cn.java;
// 测试 使用抽象类
public class Test2_UseAbstract {
	public static void main(String[] args) {
		Father2 a = new Son2();
		Son2 x = new Son2();
		System.out.println(x.a);
		x.name = "ya";
		System.out.println(x.name);
		System.out.println(Son2.MAX_VALUE);
		// Son2.MAX_VALUE = 20 ;  //TODO 常量的值不能改
		a.student();
	}

}

abstract class Father2{
	public static final int MAX_VALUE = 15 ;
	int a = 10 ;
	String name = "luo" ;
	
	//TODO 抽象里可以有构造方法
	//TODO 构造方法 用来new,抽象类不能new--为了子类new
	public Father2() {
		System.out.println(1);
	}
	public void student() {
		System.out.println(15);
	}
}

class Son2 extends Father2{
	public void student() {
		System.out.println(12);
	}
	
	public Son2() {
		super(); //隐藏着的 先触发父类的方法  后再触发子类方法
		System.out.println(2);
	}
}
