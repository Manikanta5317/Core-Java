class J 
{
	int a;

	J(int a)
	{
		this.a=a;//local a value assigning to global a 
	}
	public static void main(String[] args) 
	{
		J j1=new J(90);
		System.out.println(j1.a);
	}
}
/*
90
*/
