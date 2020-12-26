package cn.nnn;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

import javax.print.CancelablePrintJob;
public class Test02 {
	public static void main(String[] args) throws ParseException {
		System.out.print("请输入时间：");
		String day = new Scanner(System.in).next();//接受用户输入
		SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd");
		Date myDate = a.parse(day);//将String 格式的day 装换成Date格式
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(myDate);//获取myDate 在中日历中 的时间
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd  EEEE");//将formatter承载  日期+星期的格式	
		for(int i=1;i<=7;i++) {//控制一周的循环
		calendar.add(calendar.DATE,1);//表示往后一天
		myDate=calendar.getTime();
		String dateString = formatter.format(myDate);//将formatter格式的 获得的日期 赋值给字符串形式的 dateString
		System.out.println(dateString);
		}
	}
}