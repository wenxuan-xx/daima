package day050;
//测试   方法参数
public class Test05 {
	public static void main(String[] args) {
	add(10,4);//调用了指定的方法
	add1("jackt");
	add2(10,5,"jackt");
	add3("jackt",10,5);
	}
	public static void add3(String x,int a,int b) {
		System.out.println(x+a+b);//jackt105  x+a为String类型
	}
	public static void add2(int a,int b, String x) {
		System.out.println(a+b+x);//第一个+是求和  , 第二个+是拼接字符串
	}
	public static void add1(String x) {
		System.out.println(x);
	}
//创建 sdd()	
//TODO 参数类型   必须和上面add里面整数类型相匹配	
//修饰符 返回值 方法名(参数类型  参数名){}
	public static void add(int x,int y){//x,y分别接受上面的值
		System.out.println(x);//10
		System.out.println(y);//4
	}
}
