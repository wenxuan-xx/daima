package day05;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		/*for(int num = 1 ; num<=100 ; num++) {
			if(num%2==0) {//���˵�����
				
				System.out.println(num);
				//�������ѭ��,SO�ؼ��ֺ��治���ٳ��ִ���!!!
				//continue;//�������ѭ��,ִ���´�ѭ��
				break;//��������ѭ��
				
			}
		}*/
		//������88
		/*System.out.print("������һ������:");
		Scanner num = new Scanner(System.in);
		for(int i = num.nextInt() ; i>=0 ; i = num.nextInt()) {
			if(i==88) {
				System.out.println("����ȷ");
				break;
			}else {
				System.out.print("����ȷ,���������:");
				continue;
			}
		}*/
		
		for(int a = 1 ; a<=10 ; a++) {//ѭ������ִ�еĴ���
			int i = new Scanner(System.in).nextInt();//���������������
			if(i==88) {
				System.out.println("����ȷ");
				break;
			}else {
				System.out.print("����ȷ,���������:");
				continue;
			}
		}
		
		
		
	}

}
