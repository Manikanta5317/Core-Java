class P 
{
	final int i;

	P()
	{
		this("xyz");
	}
	P(String s1)
	{
		i=300;
	}
	public static void main(String[] args) 
	{
		P p1=new P();
		P p2=new P("abc");
		System.out.println(p1.i + ", " + p2.i);
	}
}
/*
300,300
final global varaible can't serve let as blank,after object creation we can't
assign a value.
we can assign value const. body ,in IIB,
*/