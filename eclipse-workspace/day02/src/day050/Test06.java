package day050;
//����    ��������ֵ
public class Test06 {
	public static void main(String[] args) {
		//2.������sum�������Ľ��
		sum(10,5);
		//3.����sum�������Ľ��
		int res = sum(10,5);
		System.out.println(res);
		
		//��ϰ
		int x = print("jack",1,2);
		System.out.println(x);		
		
		//��ϰ
		String s = add(1,2);
		System.out.println(s);
	}
	
	//����sum()
	//������Ҫ����ֵ
	//1.����ֵ��λ��--д�ɷ���ֵ����������
	public static String add(int a ,int b) {
		return a+b+"";	
	}
	public static int print(String x,int a,int b) {
		return a+b;	
	}
	
	public static int sum(int a,int b) {
		return a+b;//1,ʹ�� return �ؼ���,���ظ����õ�λ��
	}
}
