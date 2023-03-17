class A
{
	A(int i)
	{
		System.out.println("A(int)");
	}
}
class  J extends A
{
	J(int i)
	{
		super();//super with no argument
		//super(40);
		System.out.println("J(int)");
	}
	public static void main(String[] args) 
	{
		J j1=new J(100);
		System.out.println("done");
	}
}
/*
constructor A in class A cannot be applied to given types;
        {
: constructor A in class A cannot be applied to given types;
                super();
A class constructor no argument(A class will be argument constructor).

*/
