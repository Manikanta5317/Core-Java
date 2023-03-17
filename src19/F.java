class F 
{
	static int i;//i=0

    F()
	{
		i+=10;
	}
	{
		i+=20;
	}
	public static void main(String[] args) 
	{
		System.out.println(F.i);
		F f1=new F();
		System.out.println(F.i);
		System.out.println(f1.i);//f1.i=F.i(replace)static member along with reference va 
		//complier replace reference var with class name
		System.out.println(i);
		F f2=new F();
		System.out.println(F.i);
		System.out.println(f2.i);//f2.i=F.i
		System.out.println(i);
	}
}
/*
0
30
30
30
60
60
60
static can be used any where through the class.
we can access the static member directly by using static member name.
static member along with reference va complier replace reference var with class name.
class members are loading into the memory one time.

*/
