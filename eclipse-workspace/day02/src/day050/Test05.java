package day050;
//����   ��������
public class Test05 {
	public static void main(String[] args) {
	add(10,4);//������ָ���ķ���
	add1("jackt");
	add2(10,5,"jackt");
	add3("jackt",10,5);
	}
	public static void add3(String x,int a,int b) {
		System.out.println(x+a+b);//jackt105  x+aΪString����
	}
	public static void add2(int a,int b, String x) {
		System.out.println(a+b+x);//��һ��+�����  , �ڶ���+��ƴ���ַ���
	}
	public static void add1(String x) {
		System.out.println(x);
	}
//���� sdd()	
//TODO ��������   ���������add��������������ƥ��	
//���η� ����ֵ ������(��������  ������){}
	public static void add(int x,int y){//x,y�ֱ���������ֵ
		System.out.println(x);//10
		System.out.println(y);//4
	}
}
