class A 
{
	A()//constructor
	{
		System.out.println("constructor");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		A a1=new A();
		System.out.println("main end");
	}
}
/*
constructor should have same name as class name
constructor should not have return type(void,primitive,derive)
method should have return type but constructor should not have return type
constructor should execute automatically while object is creating.
constructor always Non-static but static is not possible.



main begin
constructor
main end
*/