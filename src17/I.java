class I 
{
	I(int i)
	{
		System.out.println("I(int)");
	}
	I(double i)
	{
		System.out.println("I(double)");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		I obj1=new I(10);
		System.out.println("------------");
		I obj2=new I(1.5);
		System.out.println("-----------");
		I obj3=new I(3.4);
		System.out.println("-----------");
		I obj4=new I(15);
		System.out.println("-----------");
		System.out.println("main begin");
	}
}
/*
main begin
I(int)
------------
I(double)
-----------
I(double)
-----------
I(int)
-----------
main begin
multiple constructor by choosing the difference in the signuture
one int argument,another double argument based on argument we are chossing the specify constructor 
*/
