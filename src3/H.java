class H 
{
	public static void main(String[] args) 
	{
		int i=1;
		//System.out.println(true || (i++ ==0));
		System.out.println((i++ ==0) || true);
		//                 true ||  not execute
		System.out.println(i);
	}
}
