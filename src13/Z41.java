class Z41
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
	    int i=1;
		test(i++);
		//System.out.println("main end:");
		System.out.println("main end:" + i);
	}
	public static void test(int i) 
	{
		
		System.out.println("from test:" + i );
		i=10;
	}
}
//i=1--int i--from test i=1---i=10---i=2