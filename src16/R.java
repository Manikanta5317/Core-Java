class R 
{
	int i;

	static R test()
	{
		return new R();//return statement also contain object(R class)
	}


	public static void main(String[] args) 
	{
		R r1=test();
		System.out.println(r1.i);
	}
}
/*
return statement itself we can creat an a object(R object),that will be
assign to the r1 reference variable .
*/
/*int i;
static void test(R r1)
{
System.out.println("test begin:"+ r1.i);
r1.i = 10;
System.out.println("test end:"+ r1.i);
}
public static void main(String[] args)
{
System.out.println("main begin");
R obj = new R();
obj.i = 5;
test(obj);
System.out.println("main end:" + obj.i);
}
}*/