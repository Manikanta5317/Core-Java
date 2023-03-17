interface A
{
	void test1();
}
class O implements A  
{
	public void test1()
	// void test1()
	{
		System.out.println("from test1");
	}
	public static void main(String[] args) 
	{
		O o1 =new O();
		o1.test1();
		System.out.println("done");
	}
}
/*
from test1
done
whenever develop class by using super interface use the implements keyword.
if super member is interface and sub member is class we use implements keyword.
Every interface methods are public while implementing interface method in sub class.
All interface methods are abstract those are inheriting to subclass.
*/
