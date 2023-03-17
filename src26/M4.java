class M4 
{
	static D test1()
	{
		D d1=new D();
		return d1;

	}
	public static void main(String[] args) 
	{
		A a1=test1();//A a1=(A) test1()
		B b1=test1();// B b1=(B) test1();
		C c1=test1();// C c1=(C) test1();
		System.out.println("done");
	}
}
/*
right hand side is subclass type
D type--> C type-->B type-->A type
C type-->B type-->A type
B type-->A type
Auto Upcasting
*/