package cn.java;
// TODO ������ ��������ͨ���� Ҳ�г��󷽷�
public class Test5_UseAbstract {
	public static void main(String[] args) {
		
	}
}
abstract class Fu5{
	public void get1() {
		System.out.println(1);
	}
	abstract public void get2();
}

class Zi5 extends Fu5{
	//TODO ��д����ķ��� ,�������Ϊ������
	public void get2() {
		System.out.println(2);
	}
}