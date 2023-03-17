class Z37 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(100,70);
		//test('A');
		System.out.println("main end");
	}
	public static void test(int i,char i) 
	{
		System.out.println("from test:" + i );
	}
}
//two argument should not have same name 
//even though datatypes are changing