class A
{
	void test()
	{
		System.out.println("A-test()");
	}
}
class  H extends A
{
	int test()
	{
		System.out.println("test()");
		return 10;
	}
	public static void main(String[] args)
	{
		H h1=new H();
		h1.test();
	}
}
/*
superclass return type iint is subclass return type also int.

*/