package cn.java;
//TODO 多继承  多实现
public class Test8_Interface {
	public static void main(String[] args) {
		Inter1 a = new Implements1();//TODO 多态
		a.save();//TODO 只能调用 Inter1 的功能
	}
}

interface Inter1{
	void save();
}
interface Inter2{
	void get();
}
//TODO 接口简的多继承 , 可以继承多个 
interface Inter3 extends Inter1,Inter2{//同时拥有3个接口的功能
	void delete();
}
//TODO 实现类和接口 -- 是实现关系,还能多实现
class Implements1 implements Inter1,Inter2{
//TODO 接口里面的权限的public,所以重写时要有权限
	@Override
	public void get() {
		System.out.println("已获得");	
	}
	
	@Override
	public void save() {
		System.out.println("以保存");	
	}
	
}
