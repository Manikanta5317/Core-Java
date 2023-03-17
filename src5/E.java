class E
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(true)
		{
			System.out.println("from if");
			int i=10;
			i++;
			System.out.println("from if stmt1:" + i++);
			System.out.println("from if stmt2:" + i);
			i++;
			System.out.println("from if stmt3:" + i);
			i=i+200;
			System.out.println("from if end:" + i);
		}
		System.out.println("main end");
	}
}
