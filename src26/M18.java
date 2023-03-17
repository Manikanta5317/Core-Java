class M18 
{
	public static void main(String[] args) 
	{
		A a1=new B();//upcasting
		//by using a1 we can access only A members
		System.out.println(a1.i);
		System.out.println(a1.j);

		B b1=new B();
		//
		System.out.println(b1.i);
		System.out.println(b1.j);
	}
}
/*
complier check  only reference type while accessing any member.
a1 reference is a type -- it able access the A type member,but B type members is not possible.
whereever upcasting happen, unable to access every member of object .

*/