package cn.java;
// ����  static
public class Test1_Static {
	public static void main(String[] args) {
		// TODO �����������
		Person a = new Person();
		a.test();
		a.code();// ��̬��Դ������ͨ���������
		System.out.println(a.a);
		System.out.println(a.name);
		Person.code();// ��̬��Դ����ֱ��ͨ����������
		System.out.println(Person.name);// ͨ������ֱ�ӵ������ﾲ̬��Դ������
		// ȫ�ֹ��� 
		Person a2 = new Person();
		Person a3 = new Person();
		a2.name = "luo";
		System.out.println(a3.name);
		kuu x = new kuu();
		x.code();
		
	}
}

class Person {
	// ��ͨ��Դ -- new�˲ſ����ڴ�ռ�,ֻ��ͨ�������ȡ
	static int a = 10;
	public void test() {
		// ��ͨ��Դ���þ�̬��Դ,����ֱ�ӵ���
		code();
		System.out.println(name);
		System.out.println("��ͨ��Դ");
	}

	// ��̬��Դ -- ������ļ��ض�����
	static String name = "jack";// ��ͨ������ static
	static public void code() {
		// ��̬��Դ���ܵ�����ͨ��Դ,��̬��Դֻ�ܵ��þ�̬��Դ
		// System.out.println(a);
		System.out.println("code..");
	}
}
class kuu extends Person{
	static public void code() {//static �ķ������Ա�����,���ܱ���д
		System.out.println("��д��");
	}
}
