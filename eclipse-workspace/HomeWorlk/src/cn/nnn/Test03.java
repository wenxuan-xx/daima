package cn.nnn;

import java.util.Random;
import java.util.Scanner;

//��ȭ��Ϸ
public class Test03 {
	public static void main(String[] args) {
		System.out.print("�������������:");
		int player = 0 ;
		for(int c = 0; c<=5 ; c++) {//���ƴ���
			int me = new Scanner(System.in).nextInt();//�����û���������
			int tem = new Random().nextInt(3)+1;//�������1-3����
			if(me>tem && me-tem!=2) {//���������������,�� ��������3>1�����
				System.out.println(tem+"��Ӯ��");
				player++;//��ҷ���+1
			}else if(me<tem && tem-me!=2) {////������С�������,�� ��������3>1�����
				System.out.println(tem+"ϵͳӮ");
				player--;//���˷���-1
			}else if(me==tem) {
				System.out.println(tem+"ƽ��,����");
				c--;//ƽ�ֲ��������
			}else if(me==1 && tem==3) {
				System.out.println(tem+"��Ӯ��");
				player++;
			}else if(me==3 && tem==1) {
				System.out.println(tem+"ϵͳӮ��");
				player--;
			}
		}String win = player>0?"��ϲ��":"���ź�ϵͳ";//�Ի�õķ��������ж�
		System.out.println(win+"��ʤ");
	}
}
