package cn.java;

// ����  final : ���յ���˼
// 1,��final���εķ���,����,���Ա��̳�,�����ܱ��޸�
// 2,final����������,����,����
// 3,��final���ε��಻�ܱ��̳�,��final���εı����ͱ���˳���
// 4,final �����Ķ���ʽ : public static final ��������  ��д������ = ֵ ;
public class Test3_Final {
	public static void main(String[] args) {
		new Zi().test();
	}
}

class Fu {
	public static final int NUM = 10; // ���Ե��� �����޸� NUM ��ֵ

	public void test() {
		System.out.println("���� final");
	}
}

class Zi extends Fu {
	int b = 15;

	public void test() {// �����εķ������ܱ��޸�
		System.out.println(NUM);
	}
}