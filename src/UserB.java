public class UserB extends Parent {
	
	public static UserB user = new UserB();
	public static int count1 = 0;
	public static int count2;
	public static int var = getVar();
	public int var2 = getVar2();
	
	public static int getVar() {
		System.out.println("ִ�����ྲ̬����");
		return 1;
	}
	
	public int getVar2() {
		System.out.println("ִ��������ͨ����");
		return 2;
	}

	UserB() {
		System.out.println("ִ�����๹�캯��");
		
		count1++;
		count2++;
	}
	
	public static void  hello() {
		System.out.println("ִ�����ྲ̬����");
	}
	
	{
		System.out.println("ִ����������");
	}
	
	static{
		System.out.println("ִ�����ྲ̬�����");
	}
	
	public static UserB getInstance() {
		System.out.println("ִ�д����������");
		return user;
	}
}
