class M10
{
	public static void main(String[] args) 
	{
		Object obj=new B();
		A a1=(A) obj;
		System.out.println("-------------");
		B b1=(B) obj;
		System.out.println("--------------");
	}
}
/*
original object is B which is included A also
----------
----------
*/