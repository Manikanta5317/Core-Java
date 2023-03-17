class D 
{
	public static void main(String[] args) 
	{
		final D d1=new D();
		//d1 is final we can't re-initialize
		d1=null;
		System.out.println("done");
	}
}
/*
if any varaible defined as final,re-initialize is not possible.
*/