package day04;

import java.util.Scanner;

//
public class Test01 {
	public static void main(String[] args) {
		System.out.print("�����������");
		Scanner num = new Scanner(System.in);
		for(int test = num.nextInt();test>=0;test = num.nextInt()) {			
			if(test>=90 && test<=100) {
				System.out.println("����");
			}else if(test>=80 && test<90) {
				System.out.println("����");
			}else if(test>=70 && test<80) {
				System.out.println("�е�");
			}else if(test>=60 && test<70) {
				System.out.println("����");
			}else if(test<60 && test>=0) {
				System.out.println("������");
			}else {
				System.out.println("��������Ч����");
			}
			System.out.print("���Լ������룺");
		}
	}

}
