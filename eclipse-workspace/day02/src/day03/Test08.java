package day03;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		int year = 2020 ;
		String x = "ƽ��";
		if(year%4==0 && year%100!=0 || year%400==0) {
			x = "����";
		}System.out.println(year+"�꣬��"+x);
	}
}
