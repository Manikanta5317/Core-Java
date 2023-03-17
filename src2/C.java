class C
{
	public static void main(String[] args) 
	{
		int i=1;
		int j=i++;//effect
		System.out.println(i);//effect
		System.out.println(j);//no effect
	}
}
