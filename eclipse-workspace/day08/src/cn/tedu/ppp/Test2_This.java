package cn.tedu.ppp;

public class Test2_This {
	public static void main(String[] args) {
		new Person2();
		new Person2("Sb",17);
	}
}

// ���췽����ĵ���,ʹ��this,
class Person2{
	public Person2() {
		System.out.println("This : ");
	}
	public Person2(String name,int a ) {
		this();
		System.out.println("�����޲� : ");
	}
}
class Person3{
	
}