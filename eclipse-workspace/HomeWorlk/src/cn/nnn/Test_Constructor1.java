package cn.nnn;

public class Test_Constructor1 {
	public static void main(String[] args) {
		new Good();
		
			
		Good1 m = new Good1();
		m.name = "as" ;
		System.out.println("���� :"+m.name+"--���� : "+m.age+"--ѧ�� :"+m.num);
		
	}
}

class Good{
	int age;
	String name;
	int num ;
	public void test(String name,int age ,int num) {
			this.name  = name ;
			this.age = age ;
			this.num = num ;
		System.out.println("���� :"+this.name+"--���� : "+this.age+"--ѧ�� :"+this.num);
	}
	
}
class Good1{
	int age;
	String name ;
	int num ;
	public Good1() {
		
	}
}