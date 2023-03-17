class C 
{
	public static void main(String[] args) 
	{
		final int i;
		i=10;
		//initailze
		i=10;
		//not modify
		System.out.println(i);
		System.out.println(i);
		System.out.println(i);
		System.out.println(i);
	}
}
/*
variable i might already have been assigned
                i=10;
> 
*/