package cn.java;
// 测试   多态的使用
public class Test5_UseDT {
	public static void main(String[] args) {
		//TODO
		Fu5 x = new Zi5();
		System.out.println(x.a);// 成员变量是用的父类的
		x.work();// 方法是子类重写的
		x.taobao();// maimaimai   静态方法不能被重写
		// TODO 子类扩展的,多态对象根本不让用,非要用可以创建子类对象
		Zi5 zi5 = (Zi5) x; // 向下造型   子类的引用指向父类对象
		System.out.println(zi5.a);
	}
}

class Fu5{
	int a = 10 ;
	String name = "luo" ;
	public void car() {
		System.out.println("开车");
	}
	public void work() {
		System.out.println("工作");
	}
	public static void taobao() {
		System.out.println("maimaimai");
	}
}

class Zi5 extends Fu5{
	int a = 15 ;
	String name = "ya" ;// 成员变量不存在重写
	@Override
	public void work() {
		System.out.println("写作业");
	}
	public static void taobao() {// 不是重写  只是子类扩展的方法
		System.out.println("花花花");
	}
}