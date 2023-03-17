class L 
{
	static int i;
}
class M
{
	public static void main(String[] args) 
	{
		//System.out.println(i);
		System.out.println(L.i);
	}
}
//compile time error
/* i is member of  main method--we can not use one class member 
of directly in  another method.but we use in indirectly by using class name with variable
*/