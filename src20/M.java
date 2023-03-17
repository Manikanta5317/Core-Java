class A
{
	A()
	{
		System.out.println("A()");
	}
	A(int i)
	{
		System.out.println("A(int)");
	}
}
class  M extends A
{
	M()
	{
		System.out.println("M()");
	}
	M(int i)
	{
		System.out.println("M(int)");
	}
	public static void main(String[] args) 
	{
		M obj1=new M();
		//M obj=new M(100);
		System.out.println("---------");
		M obj2=new M();
		System.out.println("---------");
	}
}
/*
A()
M()
---------
A()
M()
---------

*/