class A
{
	protected void test()
	{
		System.out.println("A-test()");
	}
}
class K extends A
{
	void test()
	{
		System.out.println("test()");
		return 10;
	}
	public static void main(String[] args)
	{
		k obj=new K();
		obj.test();
	}
}
/*
error
*/