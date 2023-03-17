class B
{
	static int i;
	static
	{
		i=10;//direct write
		System.out.println(i);//direct read
	static void test()
	{
		i=10;//in direct write
		System.out.println(i);//in direct read
	}
	public static void main(String[] args) 
	{
		System.out.println();
	}
}
//error: illegal start of expression