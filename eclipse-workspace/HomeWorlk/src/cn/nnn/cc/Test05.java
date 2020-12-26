package cn.nnn.cc;

import java.util.Arrays;
import java.util.Random;

public class Test05 {
	public static void meathod3() {
		int[] a = new int[10];
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			a[i] = new Random().nextInt(100) + 1;
			if (a[i] > max) {
				max = a[i];
			}
			System.out.println(a[i]);
		}
		System.out.println("max最大值为:" + max);
	}

	public static int[] method2() {
		int mun = 0;
		int[] a = { 57, 26, 17, 28, 33 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1) {
				mun += a[i];
			}
			System.out.println(mun);
		}
		return a;
	}

	public static int[] method() {
		int t = 0;
		int[] a = { 52, 16, 48, 15, 17 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				t++;
				System.out.println(a[i]);
			}
		}
		return a;
	}

	public static void main(String[] args) {
		int[] f = method();
		int[] he = method2();
		Arrays.sort(f);
		Arrays.sort(he);
		System.out.println(Arrays.toString(f));
		System.out.println(Arrays.toString(he));
	}
}
