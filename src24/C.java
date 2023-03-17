class C
{
	void test()
	{
		System.out.println("test()");
	}
	public boolean test(int i)
	{
		System.out.println("test(int)");
		return true;
	}

	protected double test(double i)
	{
		System.out.println("test(double)");
		return 1.5;
	}

	public static void main(String[] args) 
	{
		C c1=new C();
		c1.test();
		c1.test(10);
		c1.test(1.6);
		System.out.println("done");
	}
}
/*
test()
test(int)
test(double)
done
overloaded methods can have any return type.
*/