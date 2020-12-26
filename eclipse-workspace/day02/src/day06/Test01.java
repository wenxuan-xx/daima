package day06;
//数组  遍历数组
public class Test01 {
	public static void main(String[] args) {
		//练习
		//静态初始化
		char a[] = {'H','e','l','l','o'};
		char b[] = new char[]{'w','o','r','l','d'};
		System.out.print(a);
		System.out.println(b);
		System.out.println(a.length);
		
		//动态初始化
		char c[] = new char[5];
		c[0] = 'h';
		c[1] = 'e';
		c[2] = 'l';
		c[3] = 'l';
		c[4] = 'o';
		System.out.println(c);
		System.out.println(c.length);//c.length  获取  c数组的长度
		 //访问不存在下表就会报错,// Array Index  OutOfBounds Exception: 5
		//System.out.println(c[5]);  数组  下标       越界      错误

		for(int i = 0 ; i < c.length ; i++) {
			System.out.println(c[i]);
		}
	}
}
