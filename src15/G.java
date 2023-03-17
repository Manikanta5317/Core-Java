class G 
{
	static int i=test();// in direct write--allowed
	//illgel forward reference allowed in in direct read and any type of write
	static int j=10;

	static int test()
	{
		return j;
	}
	public static void main(String[] args) 
	{
		System.out.println(i + ", " + j);
	}
}
