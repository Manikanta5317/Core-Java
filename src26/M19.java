class M19 
{
	public static void main(String[] args) 
	{
		B b1=new B();
		System.out.println(b1.i);
		System.out.println(b1.j);

		B b2=new C();//upcasting
		//
		System.out.println(b2.i);
		System.out.println(b2.j);
		//System.out.println(b2.k);
	}
}
/*
limitation:
    whenever upcasting happening we not able access every member of object.
	
*/