class O
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		boolean b1=true;
		if(b1==!b1)//true==false
		{
			System.out.println("from if block");
		}
		System.out.println("main end:" +b1);//b1 can't change
	}
}
