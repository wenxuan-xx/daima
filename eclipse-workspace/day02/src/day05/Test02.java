package day05;

import java.util.Random;
import java.util.Scanner;
//whole(ture)  while ����ѭ��! ! !  ����ʵ�ü�(��ѭ���ı��� :  ������ѭ��������Զ����)
//for��ʽ����ѭ�� :  for(;;)
//����ʵ��break;����ѭ���ĳ���

public class Test02 {
	public static void main(String[] args) {
		//1. �����û����������
		//2. m>30  �ʹ�ӡ�������
		/*int a = new Scanner(System.in).nextInt();
		do{
			a=a-30;
			System.out.println(a);
			while(a>30);{
				System.out.println(a);
			}
		}*/
		
		//������,�ó������һ�������
		//���������������
		//�Ƚ�
		
		
		//double num1 = Math.random()   
		//math�����е�random(�������˼)����  ,  ��������double���͵����С��  ,                                
		//��ת����1-100����������  ,  ��Ҫǿת��(*100+1)
		
		int num = new Random().nextInt(100)+1;//�õ���Random����,����ֱ�Ӳ��� (X)���ڵ��������
		System.out.println(num);
		//do �����������ѭ��ִ����
		do {
			int me = new Scanner(System.in).nextInt();//��ɨ���û����������
			if(me==num) {
				System.out.println("�����");
				break;
			}else if(me>num) {
				System.out.println("����");
			}else if(me<num) {
				System.out.println("С��");
			}
		}while (num>0);//�ж�����
		
	}
}
