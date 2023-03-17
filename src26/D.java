class D extends C
{
	int l;

	void test4()
	{
		System.out.println("from D.test4");
	}
}
/*
Object class<--class A<--class B<--class C<--class D
Derived casting coverting one classtype to another classtype which are in same inheritance.
> Two type in derived casting
   Auto Upcasting
		subclass type assigning to superclass type
   Expiclit Downcasting
*/