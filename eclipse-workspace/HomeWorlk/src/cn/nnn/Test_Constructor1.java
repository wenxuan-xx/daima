package cn.nnn;

public class Test_Constructor1 {
	public static void main(String[] args) {
		new Good();
		
			
		Good1 m = new Good1();
		m.name = "as" ;
		System.out.println("姓名 :"+m.name+"--年龄 : "+m.age+"--学号 :"+m.num);
		
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
		System.out.println("姓名 :"+this.name+"--年龄 : "+this.age+"--学号 :"+this.num);
	}
	
}
class Good1{
	int age;
	String name ;
	int num ;
	public Good1() {
		
	}
}