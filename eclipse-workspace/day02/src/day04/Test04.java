package day04;

public class Test04 {
	public static void main(String[] args) {
		//语法??
		/*
		 for(int i=0 ; i<=2 ; ++i) {//外循环执行三次
			System.out.println("i是值"+i);
			for(int a=i ; a<=2 ; a++) {//内循环执行五次
					System.out.println("a是值"+a);
			}
		 }
		 */
		//外循环换控制行,内循环控制列
		/*
		  for(int i =0; i<=2; i++) {//先控制行
			for(int a=0; a<=1;a++) {
				System.out.print(a);
			}
			System.out.println();
		  }
		   */
		//打印5行5列星号
		/*
		 for(int i = 0 ; i<5 ; i++ ) {//外循环控制行
		 
			for(int n = 0 ; n<5 ; n++) {//内循环控制列
				System.out.print("*");//不换行
			}
			System.out.println();//换行
		}
		*/
		//右直角三角形
		for(int i=1;i<=5;i++) {
			for(int j = 5 ; j>=1 ; j--) {
				if(j>i) {
					System.out.print(" ");
				}else if(j<=i) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}
}
