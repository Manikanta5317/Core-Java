package pack3;
import pack2.*;

class G 
{
	public static void main(String[] args) 
	{
		A a1=new A();
		System.out.println("Hello World!");
		//System.out.println(a1.p);
		//System.out.println(a1.q);
		System.out.println(a1.r);
	}
}
/*
	* is represent every member from pack2 importing
pack3\G.java:10: error: p is not public in A; cannot be accessed from outside package
                System.out.println(a1.p);
                                     ^
pack3\G.java:11: error: q has protected access in A
                System.out.println(a1.q);
Hello World!
0
*/