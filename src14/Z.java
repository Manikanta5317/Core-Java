class Z
{
	static
	{
		System.out.println("sib begin");
		System.exit(0);//built-in
		System.out.println("sib end");
	}
	public static void main(String[] args) 
	{
		System.out.println("main");
	}
}
//enter flow terminated --in order to terminate enter flow we use built-in 
//System.exit(0)
//how to avoid the execution of main method--yes