package cn.tedu.ppp;
// ����, �̳е�  ��Ա����ʹ��
public class Test4_UseExtends {
	public static void main(String[] args) {
		//TODO 
		new Zi().shou();// ����zi����shou�ķ���
	}

}
class Fu{
	String name = "luo";
}

class Zi extends Fu{
	
	String name = "wen";
	int age = 10 ; 
	public void shou() {
		int age = 20 ;
		System.out.println(age);
		System.out.println(this.age);
		System.out.println(name);// �õ������name : wen
		// �����������ø����name
		//super�Ǹ�������һ������,ר���������ø���Ĺ���
		//Fu super =new Fu();
		System.out.println(super.name); // �õĸ����name: luo
	}
}