package cn.nnn.cc;

import java.util.Arrays;
import java.util.Random;

//--��ȡ����������ֵ��Сֵ
public class Test3 {
	public static void main(String[] args) {
		// ����һ���������
		int[] a = new int[10];
		// ���� forѭ��,����������е�ֵ
		for (int i = 0 ; i < 10; i++) {
			a[i] = new Random().nextInt(100) + 1;
			System.out.println(a[i]);
		}
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("a���������ֵΪ:"+a[0]+"; a��������СֵΪ:"+a[9]);
	}
}