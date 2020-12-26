package cn.nnn.cc;

import java.util.Arrays;
import java.util.Random;

//--获取数组里的最大值最小值
public class Test3 {
	public static void main(String[] args) {
		// 设置一个随机变量
		int[] a = new int[10];
		// 创立 for循环,随机出数组中的值
		for (int i = 0 ; i < 10; i++) {
			a[i] = new Random().nextInt(100) + 1;
			System.out.println(a[i]);
		}
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("a数组中最大值为:"+a[0]+"; a数组中最小值为:"+a[9]);
	}
}