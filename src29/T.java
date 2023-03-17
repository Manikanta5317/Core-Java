class T 
{
	static void test(Byte i)
	{
		System.out.println("test(Byte)");
	}
	static void test(Object i)
	{
		System.out.println("test(Object)");
	}
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
auto boxing 
test(Byte)
*/