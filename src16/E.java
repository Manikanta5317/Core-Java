class E
{
	int i;

	public static void main(String[] args) 
	{
		E e1=new E();
		E e2=e1;
		System.out.println(e1.i);
		System.out.println(e2.i);
	}
}
/*
e1(reference varaible)--E class of Non static variable i=0
e2 pointing e1---to E object of E class with i R.variable
one object can have any number R.v's
*/