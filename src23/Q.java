interface A
{
	void test1();
}
interface B
{
	void test2();
}
class Q implements A,B
{
	public void test1()
	{
		System.out.println("from test1");
	}
	public void test2()
	{
		System.out.println("from test2");
	}
	public static void main(String[] args) 
	{
		Q q1=new Q();
		q1.test();
		q1.test();
	}
}
/*
class can implement any number of intefaces it also called perfect multiple inheritance.
same class can implement with any number super interfaces.every interface method is public
siuting a mutiple super interface.one class multiple interfaces
*/
