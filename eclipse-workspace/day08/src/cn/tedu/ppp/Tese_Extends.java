package cn.tedu.ppp;
// ����  �̳�
public class Tese_Extends {
	public static void main(String[] args) {
		String t = new String(); 
		// ��������Ĳ��Զ���
		new Son().eat();// ʹ���˸���Ĺ���
		new Son().sleep();// ������Granfather�Ĺ���
		new Father().sleep();// ����ʹ����Granfather�Ĺ���
		Grandfather a = new Father();
		System.out.println(a.name);
	}
}

// ����һ������
class Grandfather{
	String name = "xiao";
	public void sleep() {
		System.out.println("˯");
	}
}
class Father extends Grandfather{
	
	public void eat() {
		System.out.println("��");
	}
	private void play() {
		System.out.println("����");// ˽�й��ܲ��ܱ�����̳�
	}
}
// ����һ������
class Son extends Father{
	String name = "hong";
	// �������ʹ�ø�������Թ���
}