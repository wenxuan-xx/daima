package cn.java;
// ���� ʹ�ó�����
public class Test2_UseAbstract {
	public static void main(String[] args) {
		Father2 a = new Son2();
		Son2 x = new Son2();
		System.out.println(x.a);
		x.name = "ya";
		System.out.println(x.name);
		System.out.println(Son2.MAX_VALUE);
		// Son2.MAX_VALUE = 20 ;  //TODO ������ֵ���ܸ�
		a.student();
	}

}

abstract class Father2{
	public static final int MAX_VALUE = 15 ;
	int a = 10 ;
	String name = "luo" ;
	
	//TODO ����������й��췽��
	//TODO ���췽�� ����new,�����಻��new--Ϊ������new
	public Father2() {
		System.out.println(1);
	}
	public void student() {
		System.out.println(15);
	}
}

class Son2 extends Father2{
	public void student() {
		System.out.println(12);
	}
	
	public Son2() {
		super(); //�����ŵ� �ȴ�������ķ���  ���ٴ������෽��
		System.out.println(2);
	}
}