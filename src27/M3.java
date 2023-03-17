class A
{
	static void test()
	{
		System.out.println("from A.test");
	}
}
class B extends A
{
	static void test()
	{
		System.out.println("from B.test");
	}
}
//class member avliable in B but acting as A member
class  M3
{
	public static void main(String[] args) 
	{
		A a1=new A();
		A a2=new B();
		A[] elements={a1,a2};
		for(A obj : elements)
		{
			obj.test();//A.test();
			//obj is A type
			//obj pointing to 2nd  
		}
	}
}
/*
polymerphism is not possible through static methods.
static methods are not involving in the polymerphism ,because static methods 
not involving in the overriding internally.
static member are class(one time develop,it not changing),class A method even though inheriting
to B but in B class A is acting as a A member(`A member not acting to B member)
,static member won't allowed to changes.

*/