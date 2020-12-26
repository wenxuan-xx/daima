package day06;

import java.util.Arrays;

//测试数组工具类 Arrays
public class Test03_Arrays {
	public static void main(String[] args) {
		method();// toString
		method2();// sort
		method3();// copyOf
	}

	public static void method3() {
		//1,准备原数组
		//2,调用方法完成复制
		int[] a = new int[] {1,5,7,8};
		int[] b = Arrays.copyOf(a,6);//用  int[] c  来接受返回值
		System.out.println(Arrays.toString(b));//[1, 5, 7, 8, 0, 0, ]--扩容
		int[] c = Arrays.copyOf(a,2);
		System.out.println(Arrays.toString(c));//[1, 5]--缩容    复制前两个数
	}

	public static void method2() {
		int[] a = { 7, 2, 8, 3, 9 };// 定义数组
		Arrays.sort(a);// 使用工具排序--从小到大
		System.out.println(Arrays.toString(a));// 直接打印字符串
	}

	public static void method() {
		// toString()--把数组里的数据转换成字符串
		// 1.定义数组
		// 2.遍历数组并打印
		int[] a = { 12, 15, 14, 17, 19, 36 };
		/*
		 * for(int i = 0 ; i < a.length ; i++) { System.out.println(a[i]); }
		 */
		// TODO 优化
		System.out.println(Arrays.toString(a));// [12, 15, 14, 17, 19, 36]
	}

}
