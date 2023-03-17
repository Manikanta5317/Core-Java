class M7 
{
	public static void main(String[] args) 
	{
		Object obj=new B();//Upcasting
		A a1=obj;
		B b1=obj;
		B b2=a1;
		System.out.println("done");
	}
}
/*
obj is object type that is superclass of A and B class
A also superclass to B class.
*/