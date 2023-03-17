class O 
/*{
	int i;

	static void test(O ref)// ref --R.V
	{
		System.out.println("test-begin");
		System.out.println("from test:" + ref.i);
		System.out.println("test-end");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		O obj=new O();//reference variable
		obj.i=600;
		test(obj);//while calling test method we giving obj
		System.out.println("main end");
	}
}*/
{
int i;
static void test(O r1)
{
System.out.println("test begin:"+ r1.i);
r1.i = 10;
System.out.println("test end:"+ r1.i);
}
public static void main(String[] args)
{
System.out.println("main begin");
O obj = new O();
obj.i = 5;
test(obj);
System.out.println("main end:" + obj.i);
}
}