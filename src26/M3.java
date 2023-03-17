class M3
{
	static void test1(A a1)
	{
		System.out.println("from test1:");
	}
	public static void main(String[] args) 
	{
		B b1=new B();
		D d1=new D();
		test1(b1);//test1((A) b1);
		test1(d1);//test1((A) d1);
		System.out.println("done");
	}
}
/*
string aslo upcasting to object class.
A can't used straight way in B because it B may have new members.
*/
