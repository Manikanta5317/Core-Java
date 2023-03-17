interface A
{
	void test1();
}
interface B
{
	void test2();
}
interface C extends A,B
{
	void test3();
}
class U implements C 
{
	public void test1()
	{
		System.out.println("from U-test1");
	}
	public void test2()
	{
		System.out.println("from U-test2");
	}
	public void test3()
	{
		System.out.println("from U-test3");
	}
	public static void main(String[] args) 
	{
		U u1=new U();
		u1.test1();
		u1.test2();
        u1.test3();
		System.out.println("done");
	}
}
/*
from U-test1
from U-test2
from U-test3
done
if super members are interfaces then multiple inheritance allows.
one interfaces can extend with any number of super interfaces.
class can be implements any number of super interfaces
java supports multiple inheritance through interfaces.
it is not possible to develop interface by making of super as class.because
interface not allow concrete ness(class contain concrete members).
*/