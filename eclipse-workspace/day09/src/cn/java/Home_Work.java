package cn.java;

// ������������: cgb��ʦ  Scala��ʦ
// ������Ϊ: ����  ����
// ����: ������̬����
public class Home_Work {
	public static void main(String[] args) {
		Teacher a = new Cgb();// ��������a ���� ������� Cgb
		Teacher b = new Scala();// ��������b ���� ������� Scala
		a.beike();
		a.jiangke();
		b.beike();
		b.jiangke();
	}
}

class Teacher {
	public void beike() {
		System.out.println("һ�߱���,һ�߳Է�");
	}

	public void jiangke() {
		System.out.println("һ�߽���,һ�߳Կ�����");
	}
}

class Cgb extends Teacher {
	@Override
	public void beike() {
		System.out.println("Cgb��ʦ :һ��˯��,һ�߱���");
	}
}

class Scala extends Teacher {
	@Override
	public void jiangke() {
		System.out.println("Scala��ʦ:һ�߽���,һ�߽�����");
	}
}
