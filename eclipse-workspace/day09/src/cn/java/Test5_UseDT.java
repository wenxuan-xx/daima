package cn.java;
// ����   ��̬��ʹ��
public class Test5_UseDT {
	public static void main(String[] args) {
		//TODO
		Fu5 x = new Zi5();
		System.out.println(x.a);// ��Ա�������õĸ����
		x.work();// ������������д��
		x.taobao();// maimaimai   ��̬�������ܱ���д
		// TODO ������չ��,��̬�������������,��Ҫ�ÿ��Դ����������
		Zi5 zi5 = (Zi5) x; // ��������   ���������ָ�������
		System.out.println(zi5.a);
	}
}

class Fu5{
	int a = 10 ;
	String name = "luo" ;
	public void car() {
		System.out.println("����");
	}
	public void work() {
		System.out.println("����");
	}
	public static void taobao() {
		System.out.println("maimaimai");
	}
}

class Zi5 extends Fu5{
	int a = 15 ;
	String name = "ya" ;// ��Ա������������д
	@Override
	public void work() {
		System.out.println("д��ҵ");
	}
	public static void taobao() {// ������д  ֻ��������չ�ķ���
		System.out.println("������");
	}
}