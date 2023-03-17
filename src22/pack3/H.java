package pack3;
import pack2.*;

class H extends A
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
this is  comes under uasge what why, here not using H reference.
by use a1 reference will use only q but p is default. 
H is sub class to A .no reference for H class but q and r is possible in inhertance.
*/