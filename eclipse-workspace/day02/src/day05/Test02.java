package day05;

import java.util.Random;
import java.util.Scanner;
//whole(ture)  while 的死循环! ! !  更加实用简单(死循环的本质 :  就是让循环条件永远成立)
//for形式的死循环 :  for(;;)
//必须实用break;给死循环的出后

public class Test02 {
	public static void main(String[] args) {
		//1. 接受用户输入的数字
		//2. m>30  就打印这个数字
		/*int a = new Scanner(System.in).nextInt();
		do{
			a=a-30;
			System.out.println(a);
			while(a>30);{
				System.out.println(a);
			}
		}*/
		
		//猜数字,让程序产生一个随机数
		//接受用输入的数字
		//比较
		
		
		//double num1 = Math.random()   
		//math方法中的random(随机的意思)方法  ,  产生的是double类型的随机小数  ,                                
		//想转成整1-100以类的随机数  ,  需要强转和(*100+1)
		
		int num = new Random().nextInt(100)+1;//用的是Random工具,可以直接产生 (X)以内的随机整数
		System.out.println(num);
		//do 里面的内容是循环执行体
		do {
			int me = new Scanner(System.in).nextInt();//在扫描用户输入的数字
			if(me==num) {
				System.out.println("答对了");
				break;
			}else if(me>num) {
				System.out.println("大了");
			}else if(me<num) {
				System.out.println("小了");
			}
		}while (num>0);//判断条件
		
	}
}
