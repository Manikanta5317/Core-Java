class D 
{
	int i;

	D()
	{
		i=10;
	}
	public static void main(String[] args) 
	{
		D d1=new D();
		System.out.println(d1.i);
		D d2=new D();
		System.out.println(d2.i);
		D d3=new D();
		System.out.println(d3.i);
	}
}
/*
we can intialise deserved values in the constructor body.
constructors are mainly used for intializing object members.
object is also called instances.
Non static members of object are called instance members
10
10
10
*/