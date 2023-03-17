class D 
{
	D()
	{
		System.out.println("D()");
	}
	{
		System.out.println("D-IIB");
	}
	D(int i)
	{
		System.out.println("D(int)");
	}
	public static void main(String[] args) 
	{
		D d1=new D();
		System.out.println("---------");
		D d2=new D(90);
	}
}
/*
D-IIB
D()
---------
D-IIB
D(int)
iib will be execute for one time for one object. no matter which object
execution(for different cont's).
iib execution object wise no matter which cont we will using.

*/