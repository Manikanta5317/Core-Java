class Z38
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(100);
		//test('A');
		System.out.println("main end");
	}
	public static void test(int i) 
	{
		int i=90;
		System.out.println("from test:" + i );
	}
}
// argument name and local name should not be same
//argument of method ,local variable should not be same.
//error: variable i is already defined in method test(int)