class C 
{
	int i;

	void test()
	{
		System.out.println("test:" + this.i);
		this.i=100;
	}
	public static void main(String[] args) 
	{
		C c1=new C();
		c1.i=20;
		System.out.println("main1:" + c1.i);
		c1.test();
		System.out.println("main2:" + c1.i);
	}
}
/*
main1:20
test:20
main2:100

*/