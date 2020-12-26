package cn.java;
// TODO 抽象类 里面有普通方法 也有抽象方法
public class Test5_UseAbstract {
	public static void main(String[] args) {
		
	}
}
abstract class Fu5{
	public void get1() {
		System.out.println(1);
	}
	abstract public void get2();
}

class Zi5 extends Fu5{
	//TODO 重写抽象的方法 ,让子类成为正常类
	public void get2() {
		System.out.println(2);
	}
}