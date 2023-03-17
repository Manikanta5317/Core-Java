class Z36 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(100,70);
		//test('A');
		System.out.println("main end");
	}
	public static void test(int i,int i) 
	{
		System.out.println("from test:" + i );
	}
}
//methods arguments should not same identifiers or argument identifiers
//two variable name should not be same to pass--error
