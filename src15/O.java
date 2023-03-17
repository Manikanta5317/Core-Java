class N 
{
	static void test()
	{
		System.out.println("N-test");
	}
}
class O
{
	public static void main(String[] args) 
	{
		System.out.println("O-main-begin");
		N.test();
		System.out.println("O-main-end");
	}
}
//O.java
/*we can not call test method directly--it not part of class O
but we call along with class name.we not run class N
*/