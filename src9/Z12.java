class Z12
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(args.length<2)
		{
			System.out.println("pls supply two command line args");
			return;
		}
        String s1=args[0];
        String s2=args[1];
		int i =Integer.parseInt(s1);
		int j =Integer.parseInt(s2);
		int k=i>j?i:j;
		System.out.println("max of " +i + " and " + j + " is " + k);
	}
}