package day050;
//测试  方法重载
public class Test07 {
	public static void main(String[] args) {
		String a = print("好的");
		char b = print(' ');
		int c = print(1);
		double d = print(3.0);
		boolean e = print(true);
		System.out.println(e);
	}
	public static String print(String x) {
		return x ="good";
	}
	public static char print(char a) {
		return '行';
	}
	public static int print(int a) {
		return 5;
	}
	public static double print(double a) {
		return 4.3;
	}
	public static boolean print(boolean x) {
		return false;
	}
}



//--作业:
//	--利用 xmind 工具 , 总结
//	--安装IDEA开发工具,测试 , HelloWorld
