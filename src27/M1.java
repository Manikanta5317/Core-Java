class A
{
	void test()
	{
		System.out.println("from A.test");
	}
}
class B extends A
{
	void test()
	{
		System.out.println("from B.test");
	}
}
class  M1
{
	public static void main(String[] args) 
	{
		A a1=new A();
		A a2=new B();
		//a2 assigning to B object -test method we get
		A[] elements={a1,a2};
		for(A obj : elements)
		{
			obj.test();
			//call test of method of the A and B class.
			//obj.test=a1.test
			//obj.test=a2.test
		}
	}
}
/*
from A.test
from B.test
> Method overriding-A class test method got overrided in B class.
> Auto upcasting
> two references are stored in A type array(elements)
*/