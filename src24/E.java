abstract class E
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
	abstract void test(String s1);

	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
/*
done
*/