package cn.bentian;
// 测试  封装
// 一个.java文件了可以有两个类,
// 调用  set() 设置值 ,调用  get() 获取值
public class Test3_private {
	public static void main(String[] args) {
		//TODO 测试 创建Student 对象 
		Student c = new Student();// 根据模板创建的对象叫:c
		// 调用模板里的方法
		//c.eat(); 2,被 private 了 , 不能直接调用了
		c.sleep();
		
		// 调用模板里的属性 -- 改/打印
		c.setName("luo");
		System.out.println(c.getId());
		//c.name = "wenli";
		//System.out.println(c.name);
		c.height = 1.60;
		System.out.println(c.height);
		c.setId(20);// 6,调用间接的  setId 方法进行赋值
		System.out.println(c.getId());// 8,检查id属性的值是否设置成功
		//System.out.println(c.id);
	}
}
// 封装Student类
class Student{
	// 特征+行为
	private int id;// 4,用private 封装
	String name;
	double height;
	// 5,提供一个公共的,间接型的访问方法 getId-设置id的值
	public void setId(int a) {
		id = a ;
	}
	// 7,想给id返回值,可以用 getID 的方法,返回id属性的值
	public int getId() {
		return id;// 把id的属性的值返回给外界
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		 this.name = name;
	}
	private void eat() {// 1,封装后只能再本类中使用了
		System.out.println("吃饭");		
	}
	public void sleep() {
		eat();// 3, 间接的提供  eat() 方法
		System.out.println("睡觉");
	}
}