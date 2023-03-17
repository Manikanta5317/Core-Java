class M13
{
	public static void main(String[] args) 
	{
		//Object obj=new B();
		Object obj=new D();
		A a1=(A) obj;
		System.out.println("-------------");
		B b1=(B) obj;
		System.out.println("--------------");
		C c1=(C) obj;
		System.out.println("--------------");
		D d1=(D) obj;
		System.out.println("--------------");
	}
}
/*
------------------
------------------
------------------
------------------
object type assigning to 
if depend on original object ,then up of original object we just use that object.
once object create then we won't possible to insert new members into the object.but
it is possible to modify the members of object.
*/