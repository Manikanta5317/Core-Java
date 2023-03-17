class I
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(true)
        {
			if(true)
				System.out.println("if2");//only one stmt opening closing brace not require
			System.out.println("if1 end");
        }
		System.out.println("main end");
        
	}
}
