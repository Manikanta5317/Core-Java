class I
{
	public static void main(String[] args) 
	{
		int i=10;
		System.out.println(" main begin");
		if(false)
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
