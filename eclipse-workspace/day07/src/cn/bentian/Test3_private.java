package cn.bentian;
// ����  ��װ
// һ��.java�ļ��˿�����������,
// ����  set() ����ֵ ,����  get() ��ȡֵ
public class Test3_private {
	public static void main(String[] args) {
		//TODO ���� ����Student ���� 
		Student c = new Student();// ����ģ�崴���Ķ����:c
		// ����ģ����ķ���
		//c.eat(); 2,�� private �� , ����ֱ�ӵ�����
		c.sleep();
		
		// ����ģ��������� -- ��/��ӡ
		c.setName("luo");
		System.out.println(c.getId());
		//c.name = "wenli";
		//System.out.println(c.name);
		c.height = 1.60;
		System.out.println(c.height);
		c.setId(20);// 6,���ü�ӵ�  setId �������и�ֵ
		System.out.println(c.getId());// 8,���id���Ե�ֵ�Ƿ����óɹ�
		//System.out.println(c.id);
	}
}
// ��װStudent��
class Student{
	// ����+��Ϊ
	private int id;// 4,��private ��װ
	String name;
	double height;
	// 5,�ṩһ��������,����͵ķ��ʷ��� getId-����id��ֵ
	public void setId(int a) {
		id = a ;
	}
	// 7,���id����ֵ,������ getID �ķ���,����id���Ե�ֵ
	public int getId() {
		return id;// ��id�����Ե�ֵ���ظ����
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		 this.name = name;
	}
	private void eat() {// 1,��װ��ֻ���ٱ�����ʹ����
		System.out.println("�Է�");		
	}
	public void sleep() {
		eat();// 3, ��ӵ��ṩ  eat() ����
		System.out.println("˯��");
	}
}