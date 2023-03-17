class Z9
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(args.length<1)
		{
			System.out.println("pls supply one command line args");
			return;
		}
        String s1=args[0];
		System.out.println(s1);
		int i =Integer.parseInt(s1);
		double j=Math.sqrt(i);
		System.out.println("main end: sqrt of " + i + "is :"+j);
	}
}