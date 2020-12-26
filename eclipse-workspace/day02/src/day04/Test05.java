package day04;

import java.util.Random;
import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		/*for(int i = 0; i<5; i++) {//控制行  5 行
			for(int n = 0; n<=i; n++) {//控制列  依次增加
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		//boolean a = true;
		/*if(!a) {//!表示取反,对ture取反就是false
			System.out.println(1);
		}*/
		
		System.out.print("请输入一个数字:");
		int i = new Random().nextInt(100)+1;
		System.out.println(i);
		Scanner a = new Scanner(System.in);
		for(int t = a.nextInt(); t>=0; t=a.nextInt()) {
			if(t>i) {
				System.out.print("大了,请继续:");
			}else if(t<i) {
				System.out.print("小了,请继续:");
			}else if(t==i) {
				System.out.print("恭喜,猜对了:");
				break;
			}else if(t==0) {
				System.out.println("退出游戏");
				break;
			}else {
				System.out.print("请输入0-100的数字:");
			}
		}
	}
}
