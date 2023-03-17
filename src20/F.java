class E
{
	static int i;
	static void test()
	{
		System.out.println("from test");
	}
}
class F extends E
{
	public static void main(String[] args) 
	{
		System.out.println(F.i);
		F.test();
	}
}
/*
0
from test
static and non static members are inheriting from the super class to sub class. 
*/