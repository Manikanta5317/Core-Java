class V1 
{
	int i;

	static void test()
	{
		V1 v1=new V1();
		System .out.println("test:" + v1.i);
		v1.i=10;
		System .out.println("test:" + v1.i);
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
}
