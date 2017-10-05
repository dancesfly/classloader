
public class Parent {
	
	public static int var = getPVar();
	public int var2 = getPVar2();
	
	public static int getPVar() {
		System.out.println("执行父类静态变量");
		return 1;
	}
	
	public int getPVar2() {
		System.out.println("执行父类普通变量");
		return 2;
	}
	
	Parent() {
		System.out.println("执行父类构造函数");
	}
	
	{
		System.out.println("执行父类普通代码块");
	}
	
	static {
		System.out.println("执行父类静态代码块");
	}
}
