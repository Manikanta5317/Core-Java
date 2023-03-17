package pack1;
class A
{
	private static void test()
	{
		System.out.println("from test");
	}
}
class D
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		A.test();
		System.out.println("main end");
	}
}
/*
 error: test() has private access in A
                A.test();
one class private member can't used in another class within same package.
*/