package cn.java;

// ����  ����
public class Test4_Duotai {
	public static void main(String[] args) {
		Zi3 x = new Zi3();
		x.sleep();// �����
		x.xiaqi();// �����
		x.eat();// �����
		// �ھ�1:�������� ָ�� �������
		Fu3 p = new Zi3();// ����/��������
		// �ھ�2: ���뿴��� , ���п��ұ�
		// �ô� : ͳһ�˵��ñ�׼,������Ǳ�׼
		p.eat();// ��д��������ķ�����
		p.sleep();// û��д�ø���ķ�����
		// p.show(); // �������еķ����岻�ܵ���
		Fu3 b = new Zi4();
		b.xiaqi();// �����
	}
}

class Fu3 {
	public void eat() {
		System.out.println("�Է�");
	}

	public void sleep() {
		System.out.println("˯��");
	}

	public void xiaqi() {
		System.out.println("����");
	}
}

class Zi3 extends Fu3 {
	 @Override
	public void eat() {
		System.out.println("������");
	}

	public void show() {
		System.out.println("show......");
	}
}

class Zi4 extends Fu3 {
	@Override
	public void xiaqi() {
		System.out.println("����Ϸ");
	}
}