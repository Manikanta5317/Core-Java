class Q 
{
	public static void main(String[] args) 
	{
		int i=10;
		int j=++i  + i + ++i + i;
		   //  11   11    12   12
		System.out.println(i);//12
		System.out.println(j);//46
	}
}
