package cn.nnn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import javax.swing.Spring;

public class Test01 {
	public static void main(String[] args) throws ParseException {
		System.out.print("请输入时间：");
		String num = new Scanner(System.in).next();//输入时间类型的数字
		String myTimeStr = num.intern();
		SimpleDateFormat a = new SimpleDateFormat("HH:mm:ss");
		Date myDate = a.parse(myTimeStr);//将String格式转换成Date格式
		Calendar time = Calendar.getInstance();
		time.setTime(myDate);//装换成Calender 模式
		int H = time.get(Calendar.HOUR_OF_DAY);//截取时间中Calendar格式中 time 的 Hour 的值
		int M = time.get(Calendar.MINUTE);//截取时间中Minute的值
		int[]i = {1,5,8,7,9,13,15,21,23,36};//建立数组
		String str = "结果错误";
		for(int n=0;n<i.length;n++) {
			if(H==((i[n])/2) && (i[n])%2!=0 && M>=30) {
				str = "结果正确";//针对数组里面的偶数
				break;
			}else if(H==((i[n])+1)/2 && M<=30) {
				str = "结果正确";//针对数组里面的奇数
				break;
			}
		}
		System.out.println(str+",输出结束");
	}
}
