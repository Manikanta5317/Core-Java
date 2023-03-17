interface A
{
	void test1();
}
interface B extends A
{
	void test2();
}
class T implements B 
{
	public void test1()
	{
		System.out.println("from T-test1");
	}
	public void test2()
	{
		System.out.println("from T-test2");
	}
	public static void main(String[] args) 
	{
		T t1=new T();
		t1.test1();
		t1.test2();
		System.out.println("done");
	}
}
/*
interfaces to interface--extends
class to interface--implements
class to class--extends
*/
