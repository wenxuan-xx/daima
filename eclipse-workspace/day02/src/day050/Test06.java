package day050;
//测试    方法返回值
public class Test06 {
	public static void main(String[] args) {
		//2.不出来sum返回来的结果
		sum(10,5);
		//3.处理sum返回来的结果
		int res = sum(10,5);
		System.out.println(res);
		
		//练习
		int x = print("jack",1,2);
		System.out.println(x);		
		
		//练习
		String s = add(1,2);
		System.out.println(s);
	}
	
	//创建sum()
	//方法需要返回值
	//1.返回值的位置--写成返回值的数据类型
	public static String add(int a ,int b) {
		return a+b+"";	
	}
	public static int print(String x,int a,int b) {
		return a+b;	
	}
	
	public static int sum(int a,int b) {
		return a+b;//1,使用 return 关键字,返回给调用的位置
	}
}
