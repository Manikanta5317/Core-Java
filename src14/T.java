class T 
{
	static int i=test();//i --1st intialiser
	
	static int test()
	{
		System.out.println("from test:" + i + ", " + j);
		return i+j+10;
	}
	public static void main(String[] args) 
	{
		System.out.println("main1: " + i + ", " + j);
		i=i+j+20;
		j=i+j+30;
		System.out.println("main2: " + i + ", " + j);
	}
	static int j=test();// j--2nd intialiser
	//To ready intialiser one after other
	// all intialiser are executing before main method
}
