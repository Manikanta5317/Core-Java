class T3
	{
	static int i = test1();
	static int j = test2();
	public static void main(String[] args)
	{
		System.out.println(i + ", " + j);
	}
	static int test2()
	{
			System.out.println("from test2:" + i + ", " + j);
	return 300;
	}
	static int test1()
	{
		System.out.println("from test1:" + i + ", " + j);
		return 400;
	}
}
