package cn.java;
//TODO ����  �ӿڵ�ʹ��
public class Test7_Interface {
	public static void main(String[] args) {
		Inter a = new InterImp1();
		// a.a = 15 ; // a��final���ε�
		System.out.println(Inter.a);// a�Ǿ�̬��
	}
}
//TODO �ӿ��������Դ���� public ��
interface Inter{
	//TODO �ӿڲ����й��췽��
	// public Inter() {}
	// TODO �ӿ������г�����?
	int a = 10 ;// TODO �����ļ�д,ֻ�ڽӿ������ṩ��
	// public static final int a = 10 ; 
	//TODO �ڽӿ���ĳ��󷽷�
	//abstract public void add();
	void add();// ��д�ĳ��󷽷�.���Զ�ƴ�� abstract public
}
class InterImp1 implements Inter{
	@Override
	public void add() {
		System.out.println("��������");
	}
}