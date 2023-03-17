class E 
{
	static int i=j;//before jvm notified direct read not allowed
	static int j;//jvm notify happen then go to read allow
	//static int i=j;
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
//error
//error: illegal forward reference