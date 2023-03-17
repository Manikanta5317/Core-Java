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
	void test3()
	{
		System.out.println("from C-test");
	}
}
class R extends C implements A,B
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
		R r1=new R();
		r1.test1();
		r1.test2();
		r1.test3();
	}
}
/*
from test1
from test2
from C-test
same class is extend and implement
A and B are super interfaces,C is super class.(extends>implements)


*/