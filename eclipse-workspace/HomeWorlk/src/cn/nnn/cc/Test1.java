package cn.nnn.cc;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//统计数组中偶数的个数
public class Test1 {
	public static void main(String[] args) {
		// 设置一个动态数组
		int[] arrya = new int[10];
		// 设置变量统计数组中偶数的个数
		// 设置一个循环,统计随机数组
		int a = 0;
		for (int i = 0; i < arrya.length; i++) {
			arrya[i] = new Random().nextInt(100) + 1;
			System.out.println(arrya[i]);
			if (arrya[i] % 2 == 0) {
				a++;
			}
		}
		Arrays.sort(arrya);
		System.out.println(Arrays.toString(arrya));
	}
}
