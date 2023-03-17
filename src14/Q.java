class Q
{
	static int i;
	public static void main(String[] args) 
	{
		System.out.println(Q.i);//static member keep using along with  the class name
		Q.i=20;
		System.out.println(i);
		System.out.println(Q.i);
		i=4000;
		Q.i=60;//modify
		System.out.println(i);
		System.out.println(Q.i);
		//globel along with class name they is no local
	}
}
