package day04;

import java.util.Scanner;

//
public class Test01 {
	public static void main(String[] args) {
		System.out.print("请输入分数：");
		Scanner num = new Scanner(System.in);
		for(int test = num.nextInt();test>=0;test = num.nextInt()) {			
			if(test>=90 && test<=100) {
				System.out.println("优秀");
			}else if(test>=80 && test<90) {
				System.out.println("良好");
			}else if(test>=70 && test<80) {
				System.out.println("中等");
			}else if(test>=60 && test<70) {
				System.out.println("及格");
			}else if(test<60 && test>=0) {
				System.out.println("不及格");
			}else {
				System.out.println("请输入有效分数");
			}
			System.out.print("可以继续输入：");
		}
	}

}
