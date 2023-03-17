class G
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i=10;
		if(true)
		{
			System.out.println("from if begin");
			i=i+200;
			System.out.println("from if end:" + i);
		}
		System.out.println("main end:" +i);
	}
}
