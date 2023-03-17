class F
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(true)
		{
			System.out.println("from if");
			int i=10;
			i=i+20;
			System.out.println("from if end:" + i);
		}
		System.out.println("main end:" + i);
	}
}
