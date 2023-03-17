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
class C extends B
{
	void test()
	{
		System.out.println("from C.test");
	}
}
//C class is subclass of B
class  M2
{
	public static void main(String[] args) 
	{
		A a1=new A();
		A a2=new B();
		A a3=new C();
		A[] elements={a1,a2,a3};
		for(A obj : elements)
		{
			obj.test();
		}
	}
}
/*
from A.test
from B.test
from C.test
> different methods are executing but methods name is same.
> multiple forms or multiple outputs.
> 
*/