package pack1;
class E
{
	private E()
	{
		System.out.println("E()");
	}
}
class F
{

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		E e1=new E();
		System.out.println("main begin");
	}
}
/*
error: E() has private access in E
                E e1=new E();
                     ^
using private constructor of one class can't use in another class.
allowed to use same class.
*/