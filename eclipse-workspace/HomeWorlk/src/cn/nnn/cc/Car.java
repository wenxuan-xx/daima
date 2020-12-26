package cn.nnn.cc;

public class Car {
		//特征  
		private String color;
		String pinpai;
		double cicun;
		
		public void run() {
			
			System.out.println("前进");
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color1) {
			String color = color1;
		}
		public void zuoyong() {
			System.out.println("载人");
		}
}
