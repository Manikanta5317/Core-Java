class A
{
	static void test()
	{
		System.out.println("A-test()");
	}
}
class J extends A
{
	void test()
	{
		System.out.println("test()");
		return 10;
	}
	public static void main(String[] args)
	{
		J obj=new J();
		obj.test();
	}
}
/*
error
*/