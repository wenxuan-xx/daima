package day03;

import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
			System.out.print("�����߶���M?");
			double hight = new Scanner(System.in).nextDouble();
			System.out.print("������ض���KG?");
			double weight = new Scanner(System.in).nextDouble();
			double BMI = weight/(hight*hight);
			if(BMI<18.5) {
				System.out.println("���ع���");
			}else if(BMI>=18.5 && BMI<24) {
				System.out.println("������Χ");
			}else if(BMI>=24 && BMI<27) {
				System.out.println("����");
			}else if(BMI>=27 && BMI<30) {
				System.out.println("��ȷ���");
			}else if(BMI>=30 && BMI<35) {
				System.out.println("�ضȷ���");
			}else if(BMI>=35) {
				System.out.println("�ضȷ���");
			}
			System.out.println(BMI);
	}
}
