class A 
{
	static int i;
	static
	{
		i=10;
		System.out.println(i);
		test();
	}
	static void test()
	{
		i=10;
		System.out.println(i);
	}
	public static void main(String[] args) 
	{
		System.out.println();
	}
}
//error: illegal start of expression