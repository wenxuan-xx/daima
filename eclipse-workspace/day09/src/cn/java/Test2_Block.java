package cn.java;

public class Test2_Block {
	public static void main(String[] args) {
		new Person2().show();
		new Person2(5);	// 触发局部代码块
		Person2.show();//new Person2().show();
	}
}
class Person2{
	// TODO 静态代码块 --在成员位置--类加载时触发--通常用来完成项目的初始化
	static{// 好处:来得早,走的晚  ; 只加载一次
		System.out.println("9");
	}
	// TODO 构造代码块 -- new 时触发
	{
		System.out.println("构造代码块1");
	}
	// TODO Constructor--new时触发--用来创造对象
	public Person2() {
		{
			// 局部代码块,调用方法的时候触发
			System.out.println("局部代码块1");
		}
		System.out.println("无参 构造方法1");
	}
	public Person2(int a) {
		a = 3 ;
		System.out.println("含参 构造方法"+a);
	}
	// TODO 被 static 的代码块 可以直接  类名.方法  触发
	static public void show() {
		{
			System.out.println("局部代码块2");
		}	
	}
}
