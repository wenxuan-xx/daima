package cn.tedu.ppp;
// 测试, 继承的  成员变量使用
public class Test4_UseExtends {
	public static void main(String[] args) {
		//TODO 
		new Zi().shou();// 调用zi类中shou的方法
	}

}
class Fu{
	String name = "luo";
}

class Zi extends Fu{
	
	String name = "wen";
	int age = 10 ; 
	public void shou() {
		int age = 20 ;
		System.out.println(age);
		System.out.println(this.age);
		System.out.println(name);// 用的子类的name : wen
		// 想在子类中用父类的name
		//super是父类对象的一个引用,专门用来调用父类的功能
		//Fu super =new Fu();
		System.out.println(super.name); // 用的父类的name: luo
	}
}