package cn.nnn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import javax.swing.Spring;

public class Test01 {
	public static void main(String[] args) throws ParseException {
		System.out.print("������ʱ�䣺");
		String num = new Scanner(System.in).next();//����ʱ�����͵�����
		String myTimeStr = num.intern();
		SimpleDateFormat a = new SimpleDateFormat("HH:mm:ss");
		Date myDate = a.parse(myTimeStr);//��String��ʽת����Date��ʽ
		Calendar time = Calendar.getInstance();
		time.setTime(myDate);//װ����Calender ģʽ
		int H = time.get(Calendar.HOUR_OF_DAY);//��ȡʱ����Calendar��ʽ�� time �� Hour ��ֵ
		int M = time.get(Calendar.MINUTE);//��ȡʱ����Minute��ֵ
		int[]i = {1,5,8,7,9,13,15,21,23,36};//��������
		String str = "�������";
		for(int n=0;n<i.length;n++) {
			if(H==((i[n])/2) && (i[n])%2!=0 && M>=30) {
				str = "�����ȷ";//������������ż��
				break;
			}else if(H==((i[n])+1)/2 && M<=30) {
				str = "�����ȷ";//����������������
				break;
			}
		}
		System.out.println(str+",�������");
	}
}
