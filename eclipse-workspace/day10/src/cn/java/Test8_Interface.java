package cn.java;
//TODO ��̳�  ��ʵ��
public class Test8_Interface {
	public static void main(String[] args) {
		Inter1 a = new Implements1();//TODO ��̬
		a.save();//TODO ֻ�ܵ��� Inter1 �Ĺ���
	}
}

interface Inter1{
	void save();
}
interface Inter2{
	void get();
}
//TODO �ӿڼ�Ķ�̳� , ���Լ̳ж�� 
interface Inter3 extends Inter1,Inter2{//ͬʱӵ��3���ӿڵĹ���
	void delete();
}
//TODO ʵ����ͽӿ� -- ��ʵ�ֹ�ϵ,���ܶ�ʵ��
class Implements1 implements Inter1,Inter2{
//TODO �ӿ������Ȩ�޵�public,������дʱҪ��Ȩ��
	@Override
	public void get() {
		System.out.println("�ѻ��");	
	}
	
	@Override
	public void save() {
		System.out.println("�Ա���");	
	}
	
}
