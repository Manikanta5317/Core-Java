class M6 
{
	public static void main(String[] args) 
	{
		A a1=new D();//super classtype
		B b1=(B) a1;//
		C c1=(C) a1;
		C c2=(C) b1;
		D d1=(D) a1;
		D d2=(D) b1;
		D d3=(D) c1;
		D d4=(D) c2;
		System.out.println("done");
	}
}
/*
done
Explicit Downcasting

*/