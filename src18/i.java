class I 
{
	int a;

	I(int a)//argument are local to the constructor
	{
		//a=1000;
		this.a=400;
	}
	public static void main(String[] args) 
	{
		I ref=new I(20);
		System.out.println(ref.a);
	}
}
/*
0
400
global varaible and argument both are having  same name than this keep
explicitly for executing local varaible.
if this is not keep than complier will consider only global varaible.
if local varaible is not there than this is keep explicitly.
*/
