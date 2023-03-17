abstract class A
{
	abstract void test1();//unimplement method
    //undefined feature we are not able implement than sub class member achievce.
	void test2()//engineer
	{
		System.out.println("from test2");
	}
}


class C extends A//C sub class of A
{
	void test1()//different health science
	{
		System.out.println("from test1");
	}
	public static void main(String[] args) 
	{
		C c1 =new C();
		c1.test1();
		c1.test2();
		System.out.println("done");
	}
}
/*
from test1
from test2
done
Abstract madataory for inheritance.
we use abstract method for datatype,super class
to achieve inheritance we required an encapsulation.
to achieve abstraction we required an inheritance.
*/
