package cn.java;
//TODO ����������ȫ�ǳ��󷽷�
public class Test3_UseAbstract {
	public static void main(String[] args) {
		
	}
}
//TODO �������ﶼ�ǳ��󷽷�
//TODO �������ﶼ����ͨ����
//TODO ������������ͨ�����ͳ��󷽷�

abstract class Couxiang{
	abstract public void a();
	abstract public void b();
	abstract public void c();
	abstract public void d();
}

abstract class Douyou extends Couxiang{
	public void c() {
		System.out.println("c");
	}
	public void d() {
		System.out.println("d");
	}
}