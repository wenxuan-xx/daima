package cn.java;

public class Test2_Block {
	public static void main(String[] args) {
		new Person2().show();
		new Person2(5);	// �����ֲ������
		Person2.show();//new Person2().show();
	}
}
class Person2{
	// TODO ��̬����� --�ڳ�Աλ��--�����ʱ����--ͨ�����������Ŀ�ĳ�ʼ��
	static{// �ô�:������,�ߵ���  ; ֻ����һ��
		System.out.println("9");
	}
	// TODO �������� -- new ʱ����
	{
		System.out.println("��������1");
	}
	// TODO Constructor--newʱ����--�����������
	public Person2() {
		{
			// �ֲ������,���÷�����ʱ�򴥷�
			System.out.println("�ֲ������1");
		}
		System.out.println("�޲� ���췽��1");
	}
	public Person2(int a) {
		a = 3 ;
		System.out.println("���� ���췽��"+a);
	}
	// TODO �� static �Ĵ���� ����ֱ��  ����.����  ����
	static public void show() {
		{
			System.out.println("�ֲ������2");
		}	
	}
}
