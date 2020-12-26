package cn.tedu.ppp;
// 测试 继承的  构造方法的使用
// 总结:
// 1, 当父类没有含参构造时,子类会自动生成一个 super() 去访问父类的无参构造
// 2, super() 是默认存在的,而且就在子类的第一条语句
public class Test6_UseExtends {
	public static void main(String[] args) {
		// 先执行父类的 构造方法 -- super()
		new Zi3();// 触发子类的无参构造
		// new Zi3().Fu3(); 构造方法不能被继承
	}
}
class Fu3{
	public Fu3() {
		System.out.println("父类的 构造方法");
	}
	public Fu3(int a) {
		System.out.println(a);
	}
}
class Zi3 extends Fu3{
	public Zi3(){
	//	super();// 隐藏的 ,  默认存在的  而且就在第一条语句
		System.out.println("子类的 构造方法");
	}
}