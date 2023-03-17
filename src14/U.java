class U
{
	static int i=test1();//i=6,--1st intialiser
	static int test1()
	{
		System.out.println("from test1:" + i + ", " + j);
		i+=1;
		j+=2;
		return i+j+3;//(1+2+3),(7+4+3)
	}
	static int test2()
	{
		System.out.println("from test2:" + i + ", " + j);
		i+=3;
		j+=4;
		return i+j+5;//(10+8+5)
	}
	public static void main(String[] args) 
	{
		System.out.println("main1: " + i + ", " + j);//(10,37)
		i=i+j+6;//(10+37+6)
		j=i+j+7;//(53+37+7)
		System.out.println("main2: " + i + ", " + j);
	}
	static int j=test1()+test2();// (14+23)--2nd intialiser
	//           
}
