class A//superclass
{
	int i;
}
class B extends A
{
	int j;

	public static void main(String[] args) 
	{
		B b1=new B();
		System.out.println(b1.i);
		System.out.println(b1.j);
	}
}
/*
every members of A(super class) inherited to B(sub class).
A is super class,B is sub class( A<-------- B)
extends keyword represents 
*/