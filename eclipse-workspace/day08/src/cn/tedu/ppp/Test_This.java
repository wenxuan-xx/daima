package cn.tedu.ppp;

public class Test_This {
	public static void main(String[] args) {
		new Person();
		
	}
}
class Person{
	// �� ��Ա���� �� �ֲ�����ͬ��ʱ,ʹ��this 
	int a = 20;
	int k;
	String name;
	public void Person() {
		int a = 10;
		Person p = new Person();
		// p ���൱��this,�Զ����� : Person this = new Person
		// 1, ��ͬ���ĳ�Ա�����;ֲ�����ͬ��ʱ,�� this. ���ó�Ա����
		System.out.println(p.a);
	}
}