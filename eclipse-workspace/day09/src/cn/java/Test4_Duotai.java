package cn.java;

// 测试  多肽
public class Test4_Duotai {
	public static void main(String[] args) {
		Zi3 x = new Zi3();
		x.sleep();// 父类的
		x.xiaqi();// 父类的
		x.eat();// 子类的
		// 口诀1:父类引用 指向 子类对象
		Fu3 p = new Zi3();// 多肽/向上造型
		// 口诀2: 编译看左边 , 运行看右边
		// 好处 : 统一了调用标准,父类就是标准
		p.eat();// 重写了用子类的方法体
		p.sleep();// 没重写用父类的方法体
		// p.show(); // 子类特有的方法体不能调用
		Fu3 b = new Zi4();
		b.xiaqi();// 子类的
	}
}

class Fu3 {
	public void eat() {
		System.out.println("吃饭");
	}

	public void sleep() {
		System.out.println("睡觉");
	}

	public void xiaqi() {
		System.out.println("下棋");
	}
}

class Zi3 extends Fu3 {
	 @Override
	public void eat() {
		System.out.println("吃泡面");
	}

	public void show() {
		System.out.println("show......");
	}
}

class Zi4 extends Fu3 {
	@Override
	public void xiaqi() {
		System.out.println("打游戏");
	}
}