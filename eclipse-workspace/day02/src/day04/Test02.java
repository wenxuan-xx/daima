package day04;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		System.out.print("请输入你想输入的数字：");
		Scanner num = new Scanner(System.in);
		int a = num.nextInt();
		switch (a) {
		case 0:System.out.println("白痴");
		case 1:System.out.println("年轻人不讲伍德呀！");
		case 3:System.out.println("耗子尾汁");	
		case 4:System.out.println("SB了把");
		default:System.out.println("我没折了");
		}
	}
}
