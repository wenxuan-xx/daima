package cn.bentian;
// 测试   结构方法Constructor

// 总结:
// 1,构造方法的作用: 用来创建对象
// 2,触发节点: new/实例化时
// 3,默认存在一个无参构造
// 4,给成员变量赋值
public class Test4_Constructor {
	public static void main(String[] args) {
		//TODO  创建  person 对象
		 Person a = new Person();// 触发无参构造,无参构造的好处就是可以重新赋值
		 //TODO 触发有参构造
		 new Person(5);
		 new Person("对的");
		 new Person(1.5,"luo");
	}
}
class Person{
	private int age;// 成员变量获取值的方法有两种: set()/Constructor
	//TODO 隐藏的构造方法 -- 无参构造
	//修饰符 方法名(类名)([ 参数列表 ]){  方法体     }
	//TODO 构造方法的执行时间节点 -- 创建对象时
	public Person() {// 没有有参构造时,无参构造是默认存在时,只提供有参构造的时候,无参构造就会消失了
		System.out.println("无参构造方法");	
	}
//TODO 构造方法可以重载 -- 方法名一样 , 参数列表不一样  
	public Person(int a) {// 构造方法没有返回值 ,  什么时候调用什么时候执行
		age = a ;
		System.out.println(a);
	}
	public Person(String a) {// 有参数的构造才能创建对象
		System.out.println(a);
	}
	public Person(double a,String b) {
		System.out.println(a);
		System.out.println(b);
	}
}

