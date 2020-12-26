package day06;
//学生类  , 用来描述学生特征和行为 -- 是抽象的
public class Stydent {
	//变量.属性 -- 描述 特征
	
	String name;//姓名
	int age;//年龄
	int num;//学号
	
	//方法 -- 描述  功能
	//学习
	public static void study() {
		System.out.println("学习");
	}
	//吃饭
	public static void eat() {
		System.out.println("吃饭饭");
	}
	//睡觉
	public static void sleep() {
		System.out.println("睡觉觉");
	}
}
