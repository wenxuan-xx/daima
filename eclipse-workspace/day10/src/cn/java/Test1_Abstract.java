package cn.java;
// ���� ��������ص�
public class Test1_Abstract {
	public static void main(String[] args) {
		Father1 x = new Son1();
		x.eat();
		x.drink();
	}
}

abstract class Father1{
	abstract public void eat();
	public void drink() {
		System.out.println("�Ⱦ�");
	}
	abstract public void goud();
	abstract public void momo();
}

//TODO ����̳г������Ժ�,������д���Եĳ��󷽷� �����ͨ����
class Son1 extends Father1{
	public void eat() {
		System.out.println("�Է�");
	}

	@Override
	public void goud() {
		
	}

	@Override
	public void momo() {
		
	}
	
	
}