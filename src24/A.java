class A 
{
	public static void main(String[] args) 
	{
		System.out.println("main(String[])");
	}
	public static void main(String args) 
	{
		System.out.println("main(String)");
	}
	public static void main(int args) 
	{
		System.out.println("main(String)");
	}
	public static void main() 
	{
		System.out.println("main(String)");
	}
}
/*
main(String[])
same name but difference in signuture.
main method overloading 3 times
main method taking only String args
zero number arguments also possible
while overloading any access,static/non static,return type,abstract/non,final
overloading is happening through inheritance methods.
*/
