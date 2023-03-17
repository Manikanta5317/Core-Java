class Z40
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
	    int i=100;
		test(i);
		//System.out.println("main end:");
		System.out.println("main end:" + i);
	}
	public static void test(int i) 
	{
		
		System.out.println("from test:" + i );
		i=90;
	}
}
//main method i and test method i both different