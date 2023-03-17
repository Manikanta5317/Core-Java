class T4
{
	static int i = test1();//i=19,j=9
	static int j = test2();//j=
	public static void main(String[] args)
	{
		System.out.println("from main:" + i + ", " + j);
	}
	static int test2()
	{
		System.out.println("from test2:" + i + ", " + j);
		i += i + j + 1;//i=(i+i+j+1)=48
		j += i + j + 2;//j=(j+i+j+2)=68
		return i + j + 3;//(48+68+3)
	}
	static int test1()
	{
		System.out.println("from test1:" + i + ", " + j);//(0,0)
		i += i + j + 4;//i=i+i+j+4
		j += i + j + 5;//j=j+i+j+5
		return i + j + 6;//(4+9+6)
	}
}
