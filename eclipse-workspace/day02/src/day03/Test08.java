package day03;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		int year = 2020 ;
		String x = "平年";
		if(year%4==0 && year%100!=0 || year%400==0) {
			x = "闰年";
		}System.out.println(year+"年，是"+x);
	}
}
