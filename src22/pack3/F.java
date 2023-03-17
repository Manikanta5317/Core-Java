package pack3;
import pack2.A;

class F 
{
	public static void main(String[] args) 
	{
		A a1=new A();
		System.out.println("Hello World!");
		//System.out.println(a1.p);defualt
		//System.out.println(a1.q);protected
		System.out.println(a1.r);
	}
}
/*
Error
Hello world
0
import stmt should be after package stmt for exist package name.
*/
