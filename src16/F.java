class F
{
	int i;

	public static void main(String[] args) 
	{
		F f1=new F();
		System.out.println(f1.i);
		f1.i=20;
		System.out.println(f1.i);
	}
}
/*
main method
f1-->i=0 before(through f1 we are reaching F object)
f1-->i=20 after
*/
