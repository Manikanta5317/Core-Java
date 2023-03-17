class X 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		byte b1=test();
		System.out.println("main end");
	}
	public static void test() 
	{
		System.out.println("from test");
		return 100;
	}
}
// java is more convinent in 