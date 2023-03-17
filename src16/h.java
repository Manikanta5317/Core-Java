class H 
{
	void test()
	{
		System.out.println("H-test");
	}
	public static void main(String[] args) 
	{
		H h1=new H();
		h1.test();
		System.out.println("Hello World!");
	}
}
/*
Even those Non-static members call through reference variable
*/