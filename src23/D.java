abstract class A
{
	abstract void test1();
	abstract void test2();
  
	void test3()
	{
		System.out.println("from test3");
	}
}
abstract class B extends A
{
  
	void test2()
	{
		System.out.println("from test2");
	}
}
// B contain one unimplemented method of A

class D extends B//C sub class of A
{
	void test1()
	{
		System.out.println("from test1");
	}
	public static void main(String[] args) 
	{
		D d1 =new D();
		d1.test1();
		//d1.test2();
		d1.test3();
		System.out.println("done");
	}
}
/*
from test1
from test2
from test3
done
Abstract class if not decalred abstract class B
B should be decalred as abstract class .
from A class two abstract methods are inheriting to D.
even though no abstract methods is it possible to declare abstract class -yes
*/