package cn.bentian;
//
public class Test1 {
	public static void main(String[] args) {
		// ����һ������  c ʹ�� Car ģ��
		// new Car();
		Car a = new Car();// ��ʼ��֮����е�ֵַ
		// ����ģ���еķ���
		a.ran();// �� c ������null,����null�����Ժ͹��ܾͻ��׳���ָ���쳣�Ĵ���
		a.manned();// java.lang.NullPointerException  ��ָ���쳣
		// ����ģ���еı���
		System.out.println(a.brand);// ���õı�������ֱ�Ӵ�ӡ -- ֵΪĬ��ֵ
		a.brand = "����";// ����ֱ�Ӹ�ֵ
		a.color = "��ɫ";
		a.price = 210045;
		System.out.println(a.brand);
		System.out.println(a.color);
		System.out.println(a.price);
		
		// TODO ����Carģ�� �ٴ��� c2 ����
		Car c2 = new Car();
		c2.ran();
		c2.manned();
		c2.color = "��ɫ";
		c2.brand = "˼��";
		c2.price = 231054;
		System.out.println(c2.brand);
		System.out.println(c2.color);
		System.out.println(c2.price);
	}
}
