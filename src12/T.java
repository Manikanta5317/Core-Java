class T
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		do
		{
			int i = 1;
			System.out.println("do-while-begin");
			i++;
			System.out.println("do-while-end");
		}
		while (i <= 5);
		System.out.println("main end:" + i);
	}
}
