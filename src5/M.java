class M
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		boolean b1=true;
		if(b1=false)//b1 changing to false
		{
			System.out.println("from if block");
		}
		System.out.println("main end:" +b1);
	}
}
