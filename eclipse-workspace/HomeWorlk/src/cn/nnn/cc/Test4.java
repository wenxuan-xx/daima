package cn.nnn.cc;

import java.util.Arrays;
import java.util.Random;

public class Test4 {
	public static void main(String[] args) {
		int[] a = method();
		int[] b = method2();
		Arrays.sort(a);
		System.out.println("a数组中最小值为:" + a[0] + "; a数组中最大值为:" + a[9]);
		System.out.println( Arrays.toString(b) );
	}

	private static int[] method2() {
		System.out.println();
		int t = 0;
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = new Random().nextInt(100) + 1;
			System.out.print(a[i] + ",");
			if (a[i] % 2 == 1) {
				t++;
			}
		}
		return a;
	}

	public static int[] method() {
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = new Random().nextInt(100) + 1;
			System.out.print(a[i] + ",");
		}
		return a;

	}

}
