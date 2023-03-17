class W2
{
static int i = test1();
static int j = test2();
static int test1()
	{
	System.out.println("test1 begin:" + i + ", " + j);//(0,0)
	i += j + 1;//(1)
	j += i + 2;//(3)
	main(null);
	System.out.println("test1 end:" + i);//(9)
	return i + j + 3;//(9+18+3=30)
	}
static int test2()
	{
	System.out.println("test2 begin:" + i + ", " + j);//(30,18)
	i += j + 1;//(30+18+1)
	j += i + 2;//(18+49+2=69)
	main(null);
	System.out.println("test2 end:" + i);//(61)
	return i + j + 4;//(49+69+4)
	}
public static void main(String[] args)
	{
	System.out.println("from main:" + i);//(1)
	i += j + 5;//(9),(49+69+5=123)
	j += i + 6;//(3+9+6=18)),(69+123+5)
	}
}
