package cn.tedu.ppp;
// ���� �̳е�  ���췽����ʹ��
// �ܽ�:
// 1, ������û�к��ι���ʱ,������Զ�����һ�� super() ȥ���ʸ�����޲ι���
// 2, super() ��Ĭ�ϴ��ڵ�,���Ҿ�������ĵ�һ�����
public class Test6_UseExtends {
	public static void main(String[] args) {
		// ��ִ�и���� ���췽�� -- super()
		new Zi3();// ����������޲ι���
		// new Zi3().Fu3(); ���췽�����ܱ��̳�
	}
}
class Fu3{
	public Fu3() {
		System.out.println("����� ���췽��");
	}
	public Fu3(int a) {
		System.out.println(a);
	}
}
class Zi3 extends Fu3{
	public Zi3(){
	//	super();// ���ص� ,  Ĭ�ϴ��ڵ�  ���Ҿ��ڵ�һ�����
		System.out.println("����� ���췽��");
	}
}