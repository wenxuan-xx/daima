package cn.nnn.cc;

public class TestCar {
	public static void main(String[] args) {		
		// 练习
		String s = new String() ;// 无参构造方法
		
		
		
		Car x = new Car();
		x.run();
		x.zuoyong();
		x.setColor("黑色");
		x.pinpai = "BMW";
		x.cicun = 2.15;
		System.out.println(x.cicun);
		
		
		Car x2 = new Car();
		//x2.color = "白色";
		x2.pinpai = "benci";
		x2.cicun = 3.1;
		x2.run();
		x2.zuoyong();
		
		Car c = x;// 将x保存的地址值交给c,此时x,c的地址值是一样的
	}
}
