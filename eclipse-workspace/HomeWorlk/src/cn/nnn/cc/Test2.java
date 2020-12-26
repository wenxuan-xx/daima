package cn.nnn.cc;

import java.util.Random;

//统计数组中奇数的和
public class Test2 {
	public static void main(String[] args) {
		// 设置一个动态数组
		int[] a = new int[10] ;
		// 设置一个变量统计奇数的和
		int t = 0 ;
		// 设置一个随机动态数组
		for(int i = 0 ; i < a.length ; i++) {
			a[i] = new Random().nextInt(100)+1;
			System.out.println(a[i]);
			if(a[i]%2==1) {
				t+=a[i];
			}
		}
		System.out.println(t);
	}
}
