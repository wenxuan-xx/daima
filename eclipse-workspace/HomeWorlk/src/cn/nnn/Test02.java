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
		System.out.print("������ʱ�䣺");
		String day = new Scanner(System.in).next();//�����û�����
		SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd");
		Date myDate = a.parse(day);//��String ��ʽ��day װ����Date��ʽ
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(myDate);//��ȡmyDate ���������� ��ʱ��
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd  EEEE");//��formatter����  ����+���ڵĸ�ʽ	
		for(int i=1;i<=7;i++) {//����һ�ܵ�ѭ��
		calendar.add(calendar.DATE,1);//��ʾ����һ��
		myDate=calendar.getTime();
		String dateString = formatter.format(myDate);//��formatter��ʽ�� ��õ����� ��ֵ���ַ�����ʽ�� dateString
		System.out.println(dateString);
		}
	}
}