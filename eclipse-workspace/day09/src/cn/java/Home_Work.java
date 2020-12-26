package cn.java;

// 描述两个事物: cgb老师  Scala老师
// 共性行为: 备课  讲课
// 测试: 创建多态对象
public class Home_Work {
	public static void main(String[] args) {
		Teacher a = new Cgb();// 父类引用a 保存 子类对象 Cgb
		Teacher b = new Scala();// 父类引用b 保存 子类对象 Scala
		a.beike();
		a.jiangke();
		b.beike();
		b.jiangke();
	}
}

class Teacher {
	public void beike() {
		System.out.println("一边备课,一边吃饭");
	}

	public void jiangke() {
		System.out.println("一边讲课,一边吃口香糖");
	}
}

class Cgb extends Teacher {
	@Override
	public void beike() {
		System.out.println("Cgb老师 :一边睡觉,一边备课");
	}
}

class Scala extends Teacher {
	@Override
	public void jiangke() {
		System.out.println("Scala老师:一边讲课,一边嚼槟榔");
	}
}
