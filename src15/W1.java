class E
{
static int i = test1();//12
//static intialization blocks---static intialisers----method(start static method)(it should be one time only in class)
static
	{
	System.out.println("SIB1:" + i);//12
	i += 1;//13
	}
static
	{
	System.out.println("SIB2 begin:" + i);//13
	i += 2;//15
	i += test1();//27+15=42
	i = i + test1();//42+54=96
	// i = 15 + 27;
	System.out.println("SIB2 end:" + i);
	}
public static int test1()
	{
	System.out.println("from test1:" + i);//0,15,42
	i += 3;//3,18,45
	main(null);
	return i + 4;//12,27,54
	}
public static void main(String[] args)
	{
	System.out.println("from main:" + i);//3,18,45,96
	i += 5;//8,23,50
	}
}