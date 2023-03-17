class D
{
	void test()
	{
		System.out.println("test()");
	}
	static public void test(int i)
	{
		System.out.println("test(int)");
	}

	protected void test(double i)
	{
		System.out.println("test(double)");
	}

	public static void main(String[] args) 
	{
		D d1=new D();
		d1.test();
		d1.test(10);
		d1.test(1.6);
		System.out.println("done");
	}
}
/*
overloaded methods can be static or non-static.
*/