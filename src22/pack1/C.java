package pack1;
class C
{
	private static void test()
	{
		System.out.println("from test");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		C.test();
		System.out.println("main end");
	}
}
/*
main begin
from test
main end
private member of class can be used in same class .
*/