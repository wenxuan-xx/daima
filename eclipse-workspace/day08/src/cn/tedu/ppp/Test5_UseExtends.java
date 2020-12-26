package cn.tedu.ppp;
// 测试 继承的 成员方法 使用
// 子类 : 继承父类的功能 扩展自己的功能 修改父类的功能
public class Test5_UseExtends {
	public static void main(String[] args) {
		new Zi2().doworke();// 自己扩展的
		new Zi2().play();// 继承父类的
		new Zi2().smoke();// 继承父类的
	}
}

class Fu2{
	public void play() {
		int a = 0 ;
		System.out.println(a);
	}
	public void smoke() {
		String a = "打牌" ;
		System.out.println(a);
	}
}

class Zi2 extends Fu2{
	public void doworke() {// 子类扩展自己的功能
		System.out.println("做作业");
	}
	public void play() {// 重写父类的功能
		System.out.println("别打牌了");
//		super.play();  // 调用父类的play功能 , 检验父类eat的功能是否也一样改动了
	}
}