class A
{
	void test()
	{
		System.out.println("A-test()");
	}
}
class I extends A
{
	static void test()
	{
		System.out.println("test()");
		return 10;
	}
	public static void main(String[] args)
	{
		I obj=new I();
		obj.test();
	}
}
/*
non-static not overiding with static.
*/