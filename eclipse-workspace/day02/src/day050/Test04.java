package day050;
//测试  方法调用
public class Test04 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		fun();//调用指定方法
		System.out.println(4);
	}
	//	创建 fun() -- 调用时候猜执行! ! !
	// 语法 :  修饰符 返回值 方法名 ([参数列表]){}
		
	public static void fun() {
		System.out.println(8);
		System.out.println(9);
		System.out.println(7);
		System.out.println(6);
		System.out.println(5);
	}
}
