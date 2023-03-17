interface A
{
	void test1();
}
interface B
{
	void test2();
}
class C
{
	public void test1()
	{
		System.out.println("from C-test");
	}
}
class S extends C implements A,B
{
	public void test2()
	{
		System.out.println("from test2");
	}
	public static void main(String[] args) 
	{
		S s1=new S();
		s1.test1();
		s1.test2();
	}
}
/*
from C-test
from test2
s is subclass A and b methods implements in s ,but test1 get automatically implements
from c class having implemented test1 method 
S is sub class to class c but it containing the concrete method.
*/