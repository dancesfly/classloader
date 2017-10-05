public class UserB extends Parent {
	
	public static UserB user = new UserB();
	public static int count1 = 0;
	public static int count2;
	public static int var = getVar();
	public int var2 = getVar2();
	
	public static int getVar() {
		System.out.println("执行子类静态变量");
		return 1;
	}
	
	public int getVar2() {
		System.out.println("执行子类普通变量");
		return 2;
	}

	UserB() {
		System.out.println("执行子类构造函数");
		
		count1++;
		count2++;
	}
	
	public static void  hello() {
		System.out.println("执行子类静态函数");
	}
	
	{
		System.out.println("执行子类代码块");
	}
	
	static{
		System.out.println("执行子类静态代码块");
	}
	
	public static UserB getInstance() {
		System.out.println("执行创建子类对象");
		return user;
	}
}
