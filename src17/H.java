class H
{
	H()//H() constructor signeture
	{
		System.out.println("H()");
	}
    H(int i)//H(int i) constructor
	{
		System.out.println("H(int)");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		H h1=new H();
		System.out.println("----------");
		H h2=new H(9);
		System.out.println("-----------");
		H h3=new H();
		System.out.println("-----------");
		H h4=new H(90);
		System.out.println("main end");
	}
}
/*
H()
----------
H(int)
-----------
H()
-----------
H(int)
main end
constructor overloading---
develop multiple constructor  of the same class by choosing difference 
in the signuture.
difference in  no arguments varying.
for mutilpe constructors which ever choosing (constructor--it will no arguments,number of arguments)
that will executing
*/