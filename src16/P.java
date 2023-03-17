class P 
{
	int i;

	static void test(P obj)
	{
		System.out.println("Hfrom test:" + obj.i);
		obj.i=800;
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		P p1=new P();
		p1.i=200;
		System.out.println("from main1:" + p1.i);
		test(p1);
		System.out.println("from main2:" + p1.i);
		System.out.println("from end");
	}
}
/*
main begin
from main1:200
Hfrom test:200
from main2:800
from end
*/