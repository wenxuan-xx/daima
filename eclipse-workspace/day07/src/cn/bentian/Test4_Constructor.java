package cn.bentian;
// ����   �ṹ����Constructor

// �ܽ�:
// 1,���췽��������: ������������
// 2,�����ڵ�: new/ʵ����ʱ
// 3,Ĭ�ϴ���һ���޲ι���
// 4,����Ա������ֵ
public class Test4_Constructor {
	public static void main(String[] args) {
		//TODO  ����  person ����
		 Person a = new Person();// �����޲ι���,�޲ι���ĺô����ǿ������¸�ֵ
		 //TODO �����вι���
		 new Person(5);
		 new Person("�Ե�");
		 new Person(1.5,"luo");
	}
}
class Person{
	private int age;// ��Ա������ȡֵ�ķ���������: set()/Constructor
	//TODO ���صĹ��췽�� -- �޲ι���
	//���η� ������(����)([ �����б� ]){  ������     }
	//TODO ���췽����ִ��ʱ��ڵ� -- ��������ʱ
	public Person() {// û���вι���ʱ,�޲ι�����Ĭ�ϴ���ʱ,ֻ�ṩ�вι����ʱ��,�޲ι���ͻ���ʧ��
		System.out.println("�޲ι��췽��");	
	}
//TODO ���췽���������� -- ������һ�� , �����б�һ��  
	public Person(int a) {// ���췽��û�з���ֵ ,  ʲôʱ�����ʲôʱ��ִ��
		age = a ;
		System.out.println(a);
	}
	public Person(String a) {// �в����Ĺ�����ܴ�������
		System.out.println(a);
	}
	public Person(double a,String b) {
		System.out.println(a);
		System.out.println(b);
	}
}

