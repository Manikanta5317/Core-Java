class C 
{
	C()
	{
		System.out.println("C()");
	}
	{
		System.out.println("C-IIB");//instant intialisation block
	}
	public static void main(String[] args) 
	{
		C c1=new C();
		System.out.println("--------");
		C c2 =new C();
	}
}
/*
C-IIB
C()
--------
C-IIB
C()
IIB will be execute for every object(every instants creation) creation.
it will be execution for one object creation one time.

*/
