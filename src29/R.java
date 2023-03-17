class R 
{
	Boolean b1;//b1 reference type-boxing type
	public static void main(String[] args) 
	{
		R r1=new R();
		if(r1.b1)//(r1.b1.booleanValue())
		//b1 required the boolean primitve type
		{
			System.out.println("if");
		}
		else
		{
		System.out.println("else");
		}
		System.out.println("Hello World!");
	}
}
/*
Exception in thread "main" java.lang.NullPointerException:
 Cannot invoke "java.lang.Boolean.booleanValue()" because "<local1>.b1" is null
        at R.main(R.java:7
		when ever we supply ref in place of primitive complier do auto unboxing.
*/
