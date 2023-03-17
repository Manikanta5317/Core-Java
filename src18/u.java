class  U
{
	U()
	{
		this();//current constructor
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
/*
 error: recursive constructor invocation
        U()
*/
