package day05;

public class Test03 {
	//--成员变量,类里方法外,不初始化会默认系统初始值
	static String f;//引用类型的默认值都是 null
	   int a =10;
	static int b;
	static double c;
	static boolean d;
	static char e;
	static float g;
	static long l;
	static short m;
	static byte n;
	public static void main(String[] args) {
		//--局部变量,方法里+用的时候必须初始化
		int a =3;
		double p = 10.6;
		System.out.println(f);//null
		System.out.println(b);//0
		System.out.println(c);//0.0
		System.out.println(d);//false
		System.out.println(e);//\u0000
		System.out.println(g);//0.0
		System.out.println(l);//0
		System.out.println(m);//0
		System.out.println(n);//0

	}

}
