class Z27 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i=test1();
		//int i=test2();
		System.out.println("main end:" +i );
	}
	/*public static int test1() 
	{
		System.out.println("from test1");
		return 200+test2();
	}*/
	public static int test1() 
	{
		System.out.println("from test1:");
		return test2()+100;
	}
	public static char test2() 
	{
		System.out.println("from test2");
		return 'p';
	}
}
//error: incompatible types: possible lossy conversion from int to char