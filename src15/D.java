class D 
{
	static int i;
	static
	{
		i=10;//direct write
		System.out.println(i); // direct read
		D.i=10;//in direct write
		System.out.println(D.i); //in direct read
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
// indirect along with class name and  by calling method
// direct read not allow before jvm notified