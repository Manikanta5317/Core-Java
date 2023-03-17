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
class C extends A
{
	void test3()
	{
		System.out.println("from test2");
	}
}
class  W extends A
{
	void test4()
	{
		System.out.println("from test3");
	}
	public static void main(String[] args) 
	{
		W w1=new V();
		w1.test1();
		w1.test2();
		w1.test3();
		w1.test();
		System.out.println("done");
	}
}
/*
multiple subclasses to same super class--heriercally inheritance
multilevel--same super class-one subclass--another subclass.(multiplelevels).
without inheritance not possible abstraction.
methodoverloading--developing multiple methods by same name,choosing difference in
signuture(in methods).

*/