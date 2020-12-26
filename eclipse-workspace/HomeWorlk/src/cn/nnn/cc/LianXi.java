package cn.nnn.cc;

import java.util.Random;

public class LianXi {
  // 数组练习
	public static void main(String[] args) {
		//method();//统计数组中偶数的个数
		//method1();//统计数组中奇数的和
		method2();//获取数组中的最大值和最小值
	}
   private static void method2() {
	int i = 0;
	int[] a = new int[10];
	int max = a[i];
	int min = 100;	
	for(i = 0 ; i<a.length ; i++) {
		a[i] = new Random().nextInt(100)+1;
		System.out.println(a[i]);
		if(a[i]>max) {
			max = a[i];
		}else if(a[i]<min) {
			min = a[i];
		}
	}
	System.out.println(max);	
    System.out.println(min);
}
private static void method1() {
	int num = 0 ; 
	int[] a = new int[10];
	for(int i = 0 ; i < a.length ; i++) {
		a[i] = new Random().nextInt(100)+1;
		if(a[i]%2==1) {
			num+=a[i];
		}
	}
	System.out.println(num);
}
public static void method() {
	int[] a = new int[10];
	int num = 0;
	for(int i = 0 ; i < a.length ; i++){
		a[i] = new Random().nextInt(100)+1;
		if(a[i]%2==0) {
			num++;
		}
	}
	System.out.println(num);
   }	
}

