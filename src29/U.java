class U
{
	static void test(Number i)
	{
		System.out.println("test(Number)");
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
auto upcasting
test(Object)
> preference in auto functioning:
   auto widdening > auto boxing > auto upcasting > wrarg method
  > All numeric wrapper classes contain Byte,Short,Integer,Long,Float,Double
					object
					   |
					 number
					   |
	 |		  |        |        |     |      |
   Byte     Short    Integer  Long  Float  Double

  Byte wrapper--Number,Object
  Short wrapper--Byte,Number,Object
  Integer wrapper--Short,Byte,Number,object...........
  in case wrapper upcasting.
*/