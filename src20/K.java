class A
{
	A()
	{
		System.out.println("A()");
	}
}
class  K extends A
{
	K(int i)
	{
		System.out.println("J(int)");
	}
	public static void main(String[] args) 
	{
		K obj=new K(100);
		System.out.println("done");
	}
}
/*
A()
J(int)
done
complier provide super with no agrument.
*/