package day04;

import java.util.Random;
import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		/*for(int i = 0; i<5; i++) {//������  5 ��
			for(int n = 0; n<=i; n++) {//������  ��������
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		//boolean a = true;
		/*if(!a) {//!��ʾȡ��,��tureȡ������false
			System.out.println(1);
		}*/
		
		System.out.print("������һ������:");
		int i = new Random().nextInt(100)+1;
		System.out.println(i);
		Scanner a = new Scanner(System.in);
		for(int t = a.nextInt(); t>=0; t=a.nextInt()) {
			if(t>i) {
				System.out.print("����,�����:");
			}else if(t<i) {
				System.out.print("С��,�����:");
			}else if(t==i) {
				System.out.print("��ϲ,�¶���:");
				break;
			}else if(t==0) {
				System.out.println("�˳���Ϸ");
				break;
			}else {
				System.out.print("������0-100������:");
			}
		}
	}
}
