package cn.tedu.ppp;
// ���� �̳е� ��Ա���� ʹ��
// ���� : �̳и���Ĺ��� ��չ�Լ��Ĺ��� �޸ĸ���Ĺ���
public class Test5_UseExtends {
	public static void main(String[] args) {
		new Zi2().doworke();// �Լ���չ��
		new Zi2().play();// �̳и����
		new Zi2().smoke();// �̳и����
	}
}

class Fu2{
	public void play() {
		int a = 0 ;
		System.out.println(a);
	}
	public void smoke() {
		String a = "����" ;
		System.out.println(a);
	}
}

class Zi2 extends Fu2{
	public void doworke() {// ������չ�Լ��Ĺ���
		System.out.println("����ҵ");
	}
	public void play() {// ��д����Ĺ���
		System.out.println("�������");
//		super.play();  // ���ø����play���� , ���鸸��eat�Ĺ����Ƿ�Ҳһ���Ķ���
	}
}