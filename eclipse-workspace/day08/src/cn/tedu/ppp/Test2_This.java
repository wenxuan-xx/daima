package cn.tedu.ppp;

public class Test2_This {
	public static void main(String[] args) {
		new Person2();
		new Person2("Sb",17);
	}
}

// 构造方法间的调用,使用this,
class Person2{
	public Person2() {
		System.out.println("This : ");
	}
	public Person2(String name,int a ) {
		this();
		System.out.println("调用无参 : ");
	}
}
class Person3{
	
}