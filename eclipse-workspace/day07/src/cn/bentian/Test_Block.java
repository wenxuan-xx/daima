package cn.bentian;

public class Test_Block {
	public static void main(String[] args) {
		//调用构造方法前都会先调用构造代码块
		new Demo();
		new Demo().show();// 匿名对象,用的少  只执行一次任务
		new Demo(5,"luo");
	}
}
class Demo{
	// 构造代码快:只能在成员位置  + 触发的节点:是创建new时 + 抽取构造方法中的共性代码。
	{
		int age = 0;// 提高代码的复用性
		System.out.println("构造代码块1");
	}
	//TODO constructor
	public Demo() {
		System.out.println("无参:构造方法");
	}
	public void show() {
		{
			int x = 10 ;
			System.out.println(x);
			System.out.println("局部代码块");
		}
	}
	public Demo(int a,String b) {
		System.out.println("有参:构造方法");
	}
}
