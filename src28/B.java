class B 
{
	public static void main(String[] args) 
	{
		final int i=10;
		System.out.println(i);
		System.out.println(i);
		System.out.println(i);
		System.out.println(i);
		System.out.println(i);
		System.out.println(i);
		i=10;
	}
}
/*
cannot assign a value to final variable i
                i=10;
> final varaibles can't be modify.but we can any number of times.
> even it is not possible to modify with same values.
*/
