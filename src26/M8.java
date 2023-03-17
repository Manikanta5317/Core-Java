class M8 
{
	public static void main(String[] args) 
	{
		Object obj=new B();//Upcasting
		A a1=(A) obj;
		B b1=(B) obj;
		B b2=(B) a1;
		System.out.println("done");
	}
}
/*
done
*/