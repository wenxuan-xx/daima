package cn.nnn.cc;

public class Second_Week_HW {
	public static void main(String[] args) {
		Fu cgb = new Cgb();
		Fu scala = new Scala();
		cgb.jiangke();
		cgb.beike();
		scala.jiangke();
		scala.beike();
	}
}

interface Fu{ //TODO �����ӿ�
 	public void jiangke();//TODO ����1 : ����
	public void beike();//TODO ����2 : ����
}

class Cgb implements Fu{//TODO Cgbʵ��
	@Override
	public void jiangke() {
		System.out.println("cgb��ʦ : �߽���,�߽�����");
	}

	@Override
	public void beike() {
		System.out.println("cgb��ʦ : �߱���,�߸ɷ�");
	}
}
class Scala implements Fu{//TODO Scalaʵ��
	@Override
	public void jiangke() {
		System.out.println("scala��ʦ : �߽���,�߳���");
	}

	@Override
	public void beike() {
		System.out.println("scala��ʦ : �߱���,�߶׿�");
	}
}