abstract class A
 
{
	abstract void test1();
	abstract int test3();
	void test2()
	{
	System.out.println("from test2");
	}
}
abstract class B extends A
{
	void test1()
	{
	System.out.println("from test1");
	}
}
class N1 extends B
{
	int test3()
	{
	System.out.println("from test3");
	return 45;
	}
public static void main(String[] args)

	{
	N n1 = new N();
	n1.test1();
	n1.test2();
	System.out.println(n1.test3());
	}
}
/*
from test1
from test2
from test3
45
*/