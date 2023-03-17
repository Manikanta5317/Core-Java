class P
{
	static int i;
	public static void main(String[] args) 
	{
		System.out.println(P.i);//static member keep using along with  the class name
		P.i=20;
		int i=200;//local
		System.out.println(i);
		System.out.println(P.i);
		i=4000;
		P.i=60;
		System.out.println(i);
		System.out.println(P.i);
	}
}
