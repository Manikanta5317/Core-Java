class F 
{
	int i;

	F(int arg)//argument or parameter constructor
	{
		i=arg;
	}
	public static void main(String[] args) 
	{
		F f1=new F(90);
		System.out.println(f1.i);
		F f2=new F(190);
		System.out.println(f2.i);
		F f3=new F(10);
		System.out.println(f3.i);
		F f4=new F(10);
		System.out.println(f4.i);
	}
}
/*
constructor also taking any no of arguments--
argument or parameter constructor

*/
