package day06;

import java.util.Arrays;

//�������鹤���� Arrays
public class Test03_Arrays {
	public static void main(String[] args) {
		method();// toString
		method2();// sort
		method3();// copyOf
	}

	public static void method3() {
		//1,׼��ԭ����
		//2,���÷�����ɸ���
		int[] a = new int[] {1,5,7,8};
		int[] b = Arrays.copyOf(a,6);//��  int[] c  �����ܷ���ֵ
		System.out.println(Arrays.toString(b));//[1, 5, 7, 8, 0, 0, ]--����
		int[] c = Arrays.copyOf(a,2);
		System.out.println(Arrays.toString(c));//[1, 5]--����    ����ǰ������
	}

	public static void method2() {
		int[] a = { 7, 2, 8, 3, 9 };// ��������
		Arrays.sort(a);// ʹ�ù�������--��С����
		System.out.println(Arrays.toString(a));// ֱ�Ӵ�ӡ�ַ���
	}

	public static void method() {
		// toString()--�������������ת�����ַ���
		// 1.��������
		// 2.�������鲢��ӡ
		int[] a = { 12, 15, 14, 17, 19, 36 };
		/*
		 * for(int i = 0 ; i < a.length ; i++) { System.out.println(a[i]); }
		 */
		// TODO �Ż�
		System.out.println(Arrays.toString(a));// [12, 15, 14, 17, 19, 36]
	}

}
