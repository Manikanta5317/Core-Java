
class B
{
	void test()
	{
		System.out.println("test()");
	}
	public void test(int i)
	{
		System.out.println("test(int)");
	}

	protected void test(double i)
	{
		System.out.println("test(double)");
	}

	public static void main(String[] args) 
	{
		B b1=new B();
		b1.test();
		b1.test(10);
		b1.test(1.6);
		System.out.println("done");
	}
}
/*
test()
test(int)
test(double)
done
overloaded methods can have any type of access levels
overloaded methods have any type of return type
*/
