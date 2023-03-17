class R
{
	static int i=90;
	//R class containing test method ,sib,variable

	static void test()
	{
		System.out.println("R-test");
	}
	static
	{
		System.out.println("R-SIB");
	}
}
class S
{
	static
	{
		System.out.println("S-SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("S-main-begin");
		R.test();
		System.out.println("------------");
		R.test();
		System.out.println(R.i);
		R.test();
		R.i=9000;
		System.out.println(R.i);
		R.test();
		System.out.println("S-main-end");
	}
}
/*
any class loaded to memory only one time.once loaded 
than we can use same any number of times
we can develop all classes in same file
*/