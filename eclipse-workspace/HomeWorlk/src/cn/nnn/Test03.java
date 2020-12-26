package cn.nnn;

import java.util.Random;
import java.util.Scanner;

//猜拳游戏
public class Test03 {
	public static void main(String[] args) {
		System.out.print("请输入你的数字:");
		int player = 0 ;
		for(int c = 0; c<=5 ; c++) {//控制次数
			int me = new Scanner(System.in).nextInt();//设置用户输入的入口
			int tem = new Random().nextInt(3)+1;//随机生产1-3的数
			if(me>tem && me-tem!=2) {//输入数大于随机数,且 否定了其中3>1的情况
				System.out.println(tem+"你赢了");
				player++;//玩家分数+1
			}else if(me<tem && tem-me!=2) {////输入数小于随机数,且 否定了其中3>1的情况
				System.out.println(tem+"系统赢");
				player--;//输了分数-1
			}else if(me==tem) {
				System.out.println(tem+"平局,重来");
				c--;//平局不计算次数
			}else if(me==1 && tem==3) {
				System.out.println(tem+"你赢了");
				player++;
			}else if(me==3 && tem==1) {
				System.out.println(tem+"系统赢了");
				player--;
			}
		}String win = player>0?"恭喜你":"很遗憾系统";//对获得的分数进行判断
		System.out.println(win+"获胜");
	}
}
