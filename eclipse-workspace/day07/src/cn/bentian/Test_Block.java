package cn.bentian;

public class Test_Block {
	public static void main(String[] args) {
		//���ù��췽��ǰ�����ȵ��ù�������
		new Demo();
		new Demo().show();// ��������,�õ���  ִֻ��һ������
		new Demo(5,"luo");
	}
}
class Demo{
	// ��������:ֻ���ڳ�Աλ��  + �����Ľڵ�:�Ǵ���newʱ + ��ȡ���췽���еĹ��Դ��롣
	{
		int age = 0;// ��ߴ���ĸ�����
		System.out.println("��������1");
	}
	//TODO constructor
	public Demo() {
		System.out.println("�޲�:���췽��");
	}
	public void show() {
		{
			int x = 10 ;
			System.out.println(x);
			System.out.println("�ֲ������");
		}
	}
	public Demo(int a,String b) {
		System.out.println("�в�:���췽��");
	}
}
