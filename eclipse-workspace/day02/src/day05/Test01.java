package day05;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		/*for(int num = 1 ; num<=100 ; num++) {
			if(num%2==0) {//过滤掉奇数
				
				System.out.println(num);
				//都会结束循环,SO关键字后面不能再出现代码!!!
				//continue;//结束这次循环,执行下次循环
				break;//结束整个循环
				
			}
		}*/
		//找数字88
		/*System.out.print("请输入一个数字:");
		Scanner num = new Scanner(System.in);
		for(int i = num.nextInt() ; i>=0 ; i = num.nextInt()) {
			if(i==88) {
				System.out.println("答案正确");
				break;
			}else {
				System.out.print("不正确,请继续输入:");
				continue;
			}
		}*/
		
		for(int a = 1 ; a<=10 ; a++) {//循环控制执行的次数
			int i = new Scanner(System.in).nextInt();//接受用输入的数字
			if(i==88) {
				System.out.println("答案正确");
				break;
			}else {
				System.out.print("不正确,请继续输入:");
				continue;
			}
		}
		
		
		
	}

}
