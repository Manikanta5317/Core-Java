class A 
{
	static
	{
		System.out.println("A-SIB");
	}
}

class B extends A 
{
	static
	{
		System.out.println("B-SIB");
	}
}

class Q extends B
{
    static
	{
		System.out.println("Q-SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("from main");
	}
}
/*
A-SIB
B-SIB
Q-SIB
from main
without encapsulation we won't achive inheriting.
*/