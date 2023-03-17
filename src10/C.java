class C 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i=5;
		switch(i)
		{
			case 2:
			{
				System.out.println("from case2");
			    i++;//not taken
				System.out.println("from case2");
			}
			case 4:
			{
				System.out.println("from case4:" + i);
				System.out.println("from case4");
			}
			case 5:
			{
				System.out.println("from case5");
				System.out.println("from case5:" + i);
			}
		}
		System.out.println("main end");
	}
}
