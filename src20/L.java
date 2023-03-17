class A
{
	A(int i)
	{
		System.out.println("A()");
	}
}
class  L extends A
{
	L(int i)
	{
		super(10);
		System.out.println("L(int)");
	}
	public static void main(String[] args) 
	{
		L obj=new L(100);
		System.out.println("done");
	}
}
/*
A()
L(int)
done
We can give a call to any avliable super class int argument construtor. 
*/