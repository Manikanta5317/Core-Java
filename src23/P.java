//abstract interface A---optional
interface A
{
	void test1();
	void test2();
}
class P implements A  
{
	public void test1()
	// void test1()
	{
		System.out.println("from test1");
	}
	public void test2()
	// void test1()
	{
		System.out.println("from test2");
	}
	public static void main(String[] args) 
	{
		P p1 =new P();
		p1.test1();
		p1.test2();
		System.out.println("done");
	}
}
/*
from test1
from test2
done
implements keyword represented in dot line(<- - - -).
by default interface is abstract .we required to keep abstract keyword then before interface.


*/