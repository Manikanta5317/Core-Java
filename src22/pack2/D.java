package pack2;

class D
{
	public static void main(String[] args) 
	{
		C c1=new C();
		System.out.println(c1.p);//default
		System.out.println(c1.q);//protected
		System.out.println(c1.r);//public
	}
}
/*
0
0
0
package pack2--->A				B
				 |
				 C				D
A is using in B,
A is inherting to C,
After inherting to C then we are using same members in D class(D is not sub class of C).
----------------------------------------------------
package pack3----->

A is develop in pack2 we need to use in pack3
	A is must public
	we should use along with package or import.
*/