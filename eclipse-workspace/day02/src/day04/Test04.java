package day04;

public class Test04 {
	public static void main(String[] args) {
		//�﷨??
		/*
		 for(int i=0 ; i<=2 ; ++i) {//��ѭ��ִ������
			System.out.println("i��ֵ"+i);
			for(int a=i ; a<=2 ; a++) {//��ѭ��ִ�����
					System.out.println("a��ֵ"+a);
			}
		 }
		 */
		//��ѭ����������,��ѭ��������
		/*
		  for(int i =0; i<=2; i++) {//�ȿ�����
			for(int a=0; a<=1;a++) {
				System.out.print(a);
			}
			System.out.println();
		  }
		   */
		//��ӡ5��5���Ǻ�
		/*
		 for(int i = 0 ; i<5 ; i++ ) {//��ѭ��������
		 
			for(int n = 0 ; n<5 ; n++) {//��ѭ��������
				System.out.print("*");//������
			}
			System.out.println();//����
		}
		*/
		//��ֱ��������
		for(int i=1;i<=5;i++) {
			for(int j = 5 ; j>=1 ; j--) {
				if(j>i) {
					System.out.print(" ");
				}else if(j<=i) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}
}
