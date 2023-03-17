class A
{
	void test()
	{
		System.out.println("A-test()");
	}
}
class F extends A 
{
	void test(int i)
	{
		System.out.println("F-test(int)");
	}
	public static void main(String[] args) 
	{
		F f1=new F();
		f1.test();
		f1.test(10);
		System.out.println("done");
	}
}
/*
inheriting method also supports overloading.
*/