class K
{
	public static void main(String[] args) 
	{
		System.out.println(" main begin");
		int i=10;
		if(true)
        {
			System.out.println("if block");
			i+=20;
        }
		else
        {
			System.out.println("else block");
		    i+=30;
        }
		System.out.println("main end:" + i);
	}
}