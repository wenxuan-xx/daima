package cn.nnn.cc;

public class TestCar {
	public static void main(String[] args) {		
		// ��ϰ
		String s = new String() ;// �޲ι��췽��
		
		
		
		Car x = new Car();
		x.run();
		x.zuoyong();
		x.setColor("��ɫ");
		x.pinpai = "BMW";
		x.cicun = 2.15;
		System.out.println(x.cicun);
		
		
		Car x2 = new Car();
		//x2.color = "��ɫ";
		x2.pinpai = "benci";
		x2.cicun = 3.1;
		x2.run();
		x2.zuoyong();
		
		Car c = x;// ��x����ĵ�ֵַ����c,��ʱx,c�ĵ�ֵַ��һ����
	}
}
