//multilevel inheritance
class A
{
	void test1()
	{
		System.out.println("from test1");
	}
}
class B extends A
{
	void test2()
	{
		System.out.println("from test2");
	}
}
class  V extends B
{
	void test3()
	{
		System.out.println("from test3");
	}
	public static void main(String[] args) 
	{
		V v1=new V();
		v1.test1();
		v1.test2();
		v1.test3();
		System.out.println("done");
	}
}
/*
java not supporting multiple inheritance through class,multilevel inheritance
is possible
multilevel  
*/
