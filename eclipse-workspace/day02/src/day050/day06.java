package day050;

public class day06 {
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "lisi";
		p.age = 20;
		p.eat();
		p.sleep();
	}
	
}
class Person{
	String name;
	int age;
	
	void eat() {
		System.out.println("�Է���");
	}
	void sleep() {
		System.out.println("˯����");
	}
}
