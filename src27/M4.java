class A
{
	static void test()
	{
		System.out.println("from A.test");
	}

	static
	{
		System.out.println("from A.SIB");
	}
}
class B extends A
{
	static
	{
		System.out.println("from A.SIB");
	}
}


class  M4
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		B.test();
		System.out.println("main end");
	}
}
/*
A avialble in B but A member is not member of B.
super class inheriting to subclass ,then aviable in B,but acting as superclass member.

*/