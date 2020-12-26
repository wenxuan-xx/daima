package cn.java;
// 测试 抽象类的特点
public class Test1_Abstract {
	public static void main(String[] args) {
		Father1 x = new Son1();
		x.eat();
		x.drink();
	}
}

abstract class Father1{
	abstract public void eat();
	public void drink() {
		System.out.println("喝酒");
	}
	abstract public void goud();
	abstract public void momo();
}

//TODO 子类继承抽象类以后,可以重写所以的抽象方法 变成普通的类
class Son1 extends Father1{
	public void eat() {
		System.out.println("吃饭");
	}

	@Override
	public void goud() {
		
	}

	@Override
	public void momo() {
		
	}
	
	
}