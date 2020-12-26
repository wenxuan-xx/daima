package cn.bentian;
//
public class Test1 {
	public static void main(String[] args) {
		// 创建一个对象  c 使用 Car 模板
		// new Car();
		Car a = new Car();// 初始化之后才有地址值
		// 调用模板中的方法
		a.ran();// 当 c 保存了null,调用null的属性和功能就会抛出空指针异常的错误
		a.manned();// java.lang.NullPointerException  空指针异常
		// 调用模板中的变量
		System.out.println(a.brand);// 调用的变量可以直接打印 -- 值为默认值
		a.brand = "本田";// 可以直接赋值
		a.color = "蓝色";
		a.price = 210045;
		System.out.println(a.brand);
		System.out.println(a.color);
		System.out.println(a.price);
		
		// TODO 根据Car模板 再创建 c2 对象
		Car c2 = new Car();
		c2.ran();
		c2.manned();
		c2.color = "黑色";
		c2.brand = "思域";
		c2.price = 231054;
		System.out.println(c2.brand);
		System.out.println(c2.color);
		System.out.println(c2.price);
	}
}
