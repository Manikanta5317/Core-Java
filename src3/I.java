class I
{
	public static void main(String[] args) 
	{
		int i=1;
		System.out.println(false || (i++ ==0));
		//                 false ||  execute(1==0)
		System.out.println(i);
	}
}