class  M15
{
	public static void main(String[] args) 
	{
		A a1=new C();
		System.out.println(a1 instanceof A);
		System.out.println(a1 instanceof B);
		System.out.println(a1 instanceof C);
		System.out.println(a1 instanceof D);
	}
}
/*
To avoid class casting exception 
instanceof is boolen operator
C object containing A,B,C member.through if instanceof get true then do downcasting.

*/
