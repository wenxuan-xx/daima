package day050;

import java.util.Scanner;

public class Test000 {
	public static void main(String[] args) {
		int player = 0 ; 
		  String a[] = {"ʯͷ","����","��"} ;
		while(player<=4){
			System.out.print("�����������:");
			String me = new Scanner(System.in).next();
			if(me.equals(a[0])) {
				System.out.println("ϵͳ������:��,ϵͳӮ");
				player++ ; 
			}else if(me.equals(a[1])) {
				System.out.println("ϵͳ������:ʯͷ,ϵͳӮ");
				player++ ; 
			}else if(me.equals(a[2])) {
				System.out.println("ϵͳ������:����,ϵͳӮ");
				player++ ; 
		    }
		}System.out.println("ϵͳ�÷�:"+player+"���0��,ϵͳӮ");
	}

}
