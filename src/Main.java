public class Main {

	public static void main(String[] args) {
		/***
		 *  递归
			执行父类静态变量
			执行父类静态代码块
			执行父类普通变量
			执行父类普通代码块
			执行父类构造函数
			执行子类普通变量
			执行子类代码块
			执行子类构造函数
			执行子类静态变量
			执行子类静态代码块
			执行创建子类对象
		 * 
		 */
		UserB.getInstance();
		
		/****
		 * 
		 	执行父类静态变量
			执行父类静态代码块
			执行子类静态变量
			执行子类静态代码块
			执行子类静态函数
		 * 
		 */
		User.hello();
		
		/****
		 * 
		 	执行父类静态变量
			执行父类静态代码块
			执行父类普通变量
			执行父类普通代码块
			执行父类构造函数
			执行子类普通变量
			执行子类代码块
			执行子类构造函数
			执行子类静态变量
			执行子类静态代码块
			执行创建子类对象 
		 * 
		 */
		User a = new User();
		//System.out.println("count1==" + a.count1);
		//System.out.println("count2==" + a.count2);
	}
}
