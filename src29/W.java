class W
{
	static void test(byte ... i)
	{
		System.out.println("test(Object)");
	}
	public static void main(String[] args) 
	{

		byte b1=10;
		test(b1);
	}
}
/*
where arg method is variable number arguments.
*/