class M11
{
	public static void main(String[] args) 
	{
		//Object obj=new B();
		Object obj=new C();
		A a1=(A) obj;
		System.out.println("-------------");
		B b1=(B) obj;
		System.out.println("--------------");
		C c1=(C) obj;
		System.out.println("--------------");
	}
}
/*
Exception in thread "main" java.lang.ClassCastException: 
-----------
-----------
-----------

*/