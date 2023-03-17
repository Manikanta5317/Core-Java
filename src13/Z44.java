class Z44
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
	    int i=1;
		int j=test1(i++) + i + test2(i++) + i + test1(++i) + i + test2(++i) + i;
		    //test1(1)   + 2 + test2(2)   +3  + test1(4)   + 4 + test2(5)  + 5
			//      2    + 2 +     2      + 3 +  5         + 4 +   5       + 5
			//System.out.println("main end:");
		System.out.println("main end:" + i + ", " + j);
	}
	public static int test1(int i) 
	{
		return ++i;
	}
	public static int test2(int i) 
	{
		return i++;
	}
}