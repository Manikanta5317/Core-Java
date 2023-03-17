class B 
{
	void test()
	{
		System.out.println("from test:" + this);
	}
	public static void main(String[] args) 
	{
		B b1=new B();
		System.out.println("main: " + b1);
		b1.test();

		B b2=new B();
		System.out.println("main: " + b2);
		b2.test();
	}
}
/*
main: B@2c7b84de
from test:B@2c7b84de
main: B@30f39991
from test:B@30f39991
which ever we use Reference Varaible for call test method that 
reference varaible to the non defination blocks is this(R.v).
*/
