class Y
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		do
		{
			System.out.println("do-while-begin");
			int j = 11;
			while(j <= 15)
			{
				System.out.println("inner loop begin:" + i + ", " + j);
				if(j == 13)
				{
					j++;
					continue;
				}
				System.out.println("inner loop end:" + i + ", " + j);
				j++;
			}
			System.out.println("do-while-end");
			i++;
		}
		while (i <= 5);
		System.out.println("main end:" + i);
	}
}
