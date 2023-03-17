class W 
{
	public static void main(String[] args) 
	{
		int i=5;
		int j =--i + i + --i + i + --i + i;
		System.out.println(i);//2
		System.out.println(j);//18
	}
}
