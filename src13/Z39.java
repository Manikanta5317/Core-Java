class Z39
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(100);
	
		//System.out.println("main end:");
		System.out.println("main end:" + i);
	}
	public static void test(int i) 
	{
		
		System.out.println("from test:" + i );
		i=90;
	}
}
//argument of method local to the same method
// i visible to the test method only