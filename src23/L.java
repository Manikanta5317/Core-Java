abstract class A
{
	abstract void test1();
	abstract int test3();
	 
	void test2()
	{
	System.out.println("from test2");
	}
}
class L extends A
{
	void test1()
	{
	System.out.println("from test1");
	}
public static void main(String[] args)
	{
	System.out.println("done");
	}
}
/*
 L is not abstract and does not override abstract method test3() in A
class L extends A
*/