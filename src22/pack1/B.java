package pack1;
class A
{
	private int i;
}
class B
{
	public static void main(String[] args) 
	{
		A a1=new A();
		System.out.println(a1.i);
	}
}
/*
 error: i has private access in A
                System.out.println(a1.i);
private member can't use in another class of same package.
*/