package cn.nnn.cc;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//ͳ��������ż���ĸ���
public class Test1 {
	public static void main(String[] args) {
		// ����һ����̬����
		int[] arrya = new int[10];
		// ���ñ���ͳ��������ż���ĸ���
		// ����һ��ѭ��,ͳ���������
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
