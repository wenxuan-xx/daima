package cn.nnn.cc;

public class Text2 {
	public static void main(String[] args) {
		Peroo d1 = new Peroo(10);
		Peroo d2 = new Peroo(20);
		int i = d1.a<d2.a?d1.a:d2.a;
		System.out.println(i);
	}

}
class Peroo{
	int a ;
	public Peroo(int o) {
		this.a = o ;
	}
}