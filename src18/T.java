class T
{
	T()
	{
		this(9);
	}
	T(int i)
	{
		this();
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
/*
 error: recursive constructor invocation
        T()
recursive and cyclic  not allowed in constructor body.
cyclic invokesation is also called as recursion.
1st calling 2nd one,2nd calling 1st one
*/
