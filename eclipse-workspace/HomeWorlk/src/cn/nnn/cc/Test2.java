package cn.nnn.cc;

import java.util.Random;

//ͳ�������������ĺ�
public class Test2 {
	public static void main(String[] args) {
		// ����һ����̬����
		int[] a = new int[10] ;
		// ����һ������ͳ�������ĺ�
		int t = 0 ;
		// ����һ�������̬����
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
