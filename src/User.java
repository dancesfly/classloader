public class User extends Parent{

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
		count1++;
		return 2;
	}

	User() {
		System.out.println("执行子类构造函数");
		
		//count1++;
		//count2++;
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
}
