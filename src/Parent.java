
public class Parent {
	
	public static int var = getPVar();
	public int var2 = getPVar2();
	
	public static int getPVar() {
		System.out.println("ִ�и��ྲ̬����");
		return 1;
	}
	
	public int getPVar2() {
		System.out.println("ִ�и�����ͨ����");
		return 2;
	}
	
	Parent() {
		System.out.println("ִ�и��๹�캯��");
	}
	
	{
		System.out.println("ִ�и�����ͨ�����");
	}
	
	static {
		System.out.println("ִ�и��ྲ̬�����");
	}
}
