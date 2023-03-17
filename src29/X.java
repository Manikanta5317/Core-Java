class X
{
	static void test(byte ... i)
	{
		System.out.println("test(var arg)");
	}
	public static void main(String[] args) 
	{

		byte b1=10;
		test(b1);
		test();
		test(b1,b1);
		test(b1,b1,b1);
		test(b1,b1,b1,b1,b1);
	}
}
/*
vararg method is any number of arguments 
*/