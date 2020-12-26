package cn.java;
//TODO 抽象类里面全是抽象方法
public class Test3_UseAbstract {
	public static void main(String[] args) {
		
	}
}
//TODO 抽象类里都是抽象方法
//TODO 抽象类里都是普通方法
//TODO 抽象类里有普通方法和抽象方法

abstract class Couxiang{
	abstract public void a();
	abstract public void b();
	abstract public void c();
	abstract public void d();
}

abstract class Douyou extends Couxiang{
	public void c() {
		System.out.println("c");
	}
	public void d() {
		System.out.println("d");
	}
}