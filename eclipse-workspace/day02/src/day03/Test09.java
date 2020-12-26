package day03;

import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
			System.out.print("你的身高多少M?");
			double hight = new Scanner(System.in).nextDouble();
			System.out.print("你的体重多少KG?");
			double weight = new Scanner(System.in).nextDouble();
			double BMI = weight/(hight*hight);
			if(BMI<18.5) {
				System.out.println("体重过轻");
			}else if(BMI>=18.5 && BMI<24) {
				System.out.println("正常范围");
			}else if(BMI>=24 && BMI<27) {
				System.out.println("过重");
			}else if(BMI>=27 && BMI<30) {
				System.out.println("轻度肥胖");
			}else if(BMI>=30 && BMI<35) {
				System.out.println("重度肥胖");
			}else if(BMI>=35) {
				System.out.println("重度肥胖");
			}
			System.out.println(BMI);
	}
}
