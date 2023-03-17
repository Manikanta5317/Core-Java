class P 
{
	P(int i,int j)
	{
		this(9.5);//3rd cont
		System.out.println("P(int,int)");
	}
	P(int j)
	{
		this(3,4);//1st,3rd cont
		System.out.println("P(int)");
	}
	P(double d)
	{
		System.out.println("P(double)");
	}
	public static void main(String[] args) 
	{
		P p1=new P(10,20);
		System.out.println("---------");
		P p2=new P(10);
		System.out.println("---------");
		P p3=new P(3.4);
		System.out.println("---------");
	}
}
/*
P(double)
P(int,int)
---------
P(double)
P(int,int)
P(int)
---------
P(double)
---------
multiple constructors are executing through constructor.
we need multiple constructors for one object. 
*/
