class J
{
	public static void main(String[] args) 
	{
		int i=1;
		System.out.println((i++ == 1) || (i++ ==2));//(1==1) || (2==2)
		//                 true ||  not execute
		System.out.println(i);
	}
}