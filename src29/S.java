class S 
{
	static void test(int i)
	{
		System.out.println("test(int)");
	}
	static void test(byte i)
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
auto widdening
auto upcasting
auto boxing
order following the 
auto widening 
test(int)
*/
