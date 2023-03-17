class C
{
	static int i;
	static int j=i;//direct read of i
	static int k=C.i;//in direct read of i
	public static void main(String[] args) 
	{
		System.out.println("main");
	}
}
//error: illegal start of expression