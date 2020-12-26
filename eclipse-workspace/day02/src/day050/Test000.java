package day050;

import java.util.Scanner;

public class Test000 {
	public static void main(String[] args) {
		int player = 0 ; 
		  String a[] = {"石头","剪刀","布"} ;
		while(player<=4){
			System.out.print("请输入你出的:");
			String me = new Scanner(System.in).next();
			if(me.equals(a[0])) {
				System.out.println("系统出的是:布,系统赢");
				player++ ; 
			}else if(me.equals(a[1])) {
				System.out.println("系统出的是:石头,系统赢");
				player++ ; 
			}else if(me.equals(a[2])) {
				System.out.println("系统出的是:剪刀,系统赢");
				player++ ; 
		    }
		}System.out.println("系统得分:"+player+"你得0分,系统赢");
	}

}
