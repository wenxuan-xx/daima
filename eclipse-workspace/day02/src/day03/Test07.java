package day03;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in); 
		int a = num.nextInt();
		int b = num.nextInt();
		int c = num.nextInt();
		int max = a>b?a:b;
		int Max = (max = a>b?a:b)>c?max:c;
		System.out.println(Max);
	}
}
