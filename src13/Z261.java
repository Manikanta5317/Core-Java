class Z261 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		char i=test1();
		System.out.println("main end:" + i );
	}
	public static char test1() 
	{
		System.out.println("from test1");
		return test2();
	}
	public static char test2() 
	{
		System.out.println("from test2");
		return 'p';
	}
}