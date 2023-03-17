package pack3;
import pack2.*;

class J extends A
{
	public static void main(String[] args) 
	{
		J obj=new J();
		System.out.println("Hello World!");
		//System.out.println(obj.p);
		System.out.println(obj.q);
		System.out.println(obj.r);
	}
}
/*
protect and public both are inheriting to any sub class of same or different package.
but in protected member usage to sub class of same package
In public member usage to any sub class of same or different package.
protect member while inherting sub class of another package it will be acting as

A---->C
A----->I-----.J
*/