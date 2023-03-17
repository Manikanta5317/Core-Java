class M1 
{
	public static void main(String[] args) 
	{
		A a1=new A();
		B b1=new B();
		C c1=new C();
		D d1=new D();

		A a2=a1;
		B b2=b1;
		C c2=c1;
		D d2=d1;

		d1=d2;
		c1=c2;
		b1=b2;
		a1=a2;
		System.out.println("done");
	}
}
/*
homogenous 
which ever members are in under the one inheritance those are involve in derived casting.

*/
