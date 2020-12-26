package day06;

import java.util.Random;

public class Test02_Array {
	public static void main(String[] args) {
		method();// 调用指定方法
		method2();
		int[] x = method3();//int[] x = a[i]
		method4(x);
	}

	public static void method() {
		// 1 , 静态创建数组
		int[] array = { 1, 3, 5, 7, 8, 9, 12, 15, 16 };

		// 2, 遍历数组
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static void method2() {
		int[] day = { 31, 28, 31, 30, 31, 30, 31, 31, 90, 31, 30, 31 };
		for (int i = 0; i < day.length; i++) {
			System.out.println("第" + (i + 1) + "月有:" + day[i] + "天");
		}
	}

	// 定义数组,存入随机数
	public static int[] method3() {
		int[] a = new int[5];// 先建立一个动态数组
		for (int i = 0; i < a.length; i++) {// 组件for循环 一边等于a[i],一边等于随机数
			a[i] = new Random().nextInt(100) + 1;
			System.out.print(a[i] + " ");
		}
		return a;
	}

	public static void method4(int[] x) {
		System.out.println();
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 == 1) {
				System.out.println(x[i]);
			}
		}

	}

}
