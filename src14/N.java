class N
{
	static int a;
	public static void main(String[] args) 
	{
		System.out.println(a);//globel a
		a=20;
		System.out.println(a);//globel a
		int a=200;//local a
		System.out.println(a);
		System.out.println(N.a);//To need globel along with class name
		//
	}
}
