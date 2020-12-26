package cn.java;

// 测试  final : 最终的意思
// 1,被final修饰的方法,变量,可以被继承,但不能被修改
// 2,final可以修饰类,方法,变量
// 3,被final修饰的类不能被继承,被final修饰的变量就变成了常量
// 4,final 常量的定义式 : public static final 数据类型  大写常量名 = 值 ;
public class Test3_Final {
	public static void main(String[] args) {
		new Zi().test();
	}
}

class Fu {
	public static final int NUM = 10; // 可以调用 不能修改 NUM 的值

	public void test() {
		System.out.println("测试 final");
	}
}

class Zi extends Fu {
	int b = 15;

	public void test() {// 被修饰的方法不能被修改
		System.out.println(NUM);
	}
}