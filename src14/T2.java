class T2
{
	static int i = test();
	static int j = test();
	public static void main(String[] args)
	{
		System.out.println(i + ", " + j);
	}
	static int test()
	{
		System.out.println("from test");
		return 400;
	}
}