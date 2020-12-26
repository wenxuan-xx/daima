package cn.java;
//TODO 测试  接口的使用
public class Test7_Interface {
	public static void main(String[] args) {
		Inter a = new InterImp1();
		// a.a = 15 ; // a是final修饰的
		System.out.println(Inter.a);// a是静态的
	}
}
//TODO 接口里面的资源都是 public 的
interface Inter{
	//TODO 接口不能有构造方法
	// public Inter() {}
	// TODO 接口里面有常量吗?
	int a = 10 ;// TODO 常量的简写,只在接口里面提供了
	// public static final int a = 10 ; 
	//TODO 在接口里的抽象方法
	//abstract public void add();
	void add();// 简写的抽象方法.会自动拼接 abstract public
}
class InterImp1 implements Inter{
	@Override
	public void add() {
		System.out.println("保存数据");
	}
}