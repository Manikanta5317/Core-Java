class Z35 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(100,70);
		//test('A');
		System.out.println("main end");
	}
	public static void test(int i,int j) 
	{
		System.out.println("from test:" + i + ", " + j);
	}
}