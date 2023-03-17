class Z45
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
	    int i=1;
		int j=test1(i++ + i) + i + test2(i++ + i) + i + 
            //test1(1 + 2) + 2 + test2(2 + 3) + 3 + 
		    //test1(3) + 2 + test2(5) + 3 + 
			//   4     + 2  +5        + 3=14
			test1(++i + i) + i + test2(++i + i) + i +
		  //test1(4 + 4) + 4 + test2(5 + 5) + 5 +
		  //test1(8) + 4 + test2(10) + 5 +
		  //  9      + 4  +10         +5=28
			test3(++i + i) + i + test4(++i + i) + i +
		  //test3(6 + 6) + 6 + test4(7 + 7) + 7 +
		  //test3(12) + 6 + test4(14) + 7 +
		  //  12     +6  +13         + 7=38
			test3(++i + i) + i + test4(++i + i) + i;
		  //test3(8 + 8) + 8 + test4(9 + 9) + 9; 
		  //test3(16) + 8 + test4(18) + 9;
		  //16        + 8  +17         + 9=50
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
	public static int test3(int i) 
	{
		return i--;
	}
	public static int test4(int i) 
	{
		return --i;
	}
}