package day06;
//����  ��������
public class Test01 {
	public static void main(String[] args) {
		//��ϰ
		//��̬��ʼ��
		char a[] = {'H','e','l','l','o'};
		char b[] = new char[]{'w','o','r','l','d'};
		System.out.print(a);
		System.out.println(b);
		System.out.println(a.length);
		
		//��̬��ʼ��
		char c[] = new char[5];
		c[0] = 'h';
		c[1] = 'e';
		c[2] = 'l';
		c[3] = 'l';
		c[4] = 'o';
		System.out.println(c);
		System.out.println(c.length);//c.length  ��ȡ  c����ĳ���
		 //���ʲ������±�ͻᱨ��,// Array Index  OutOfBounds Exception: 5
		//System.out.println(c[5]);  ����  �±�       Խ��      ����

		for(int i = 0 ; i < c.length ; i++) {
			System.out.println(c[i]);
		}
	}
}
