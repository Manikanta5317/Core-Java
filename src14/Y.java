class Y 
{
	static
	{
		System.out.println("sib begin");
		main(null);//main  method calling
		System.out.println("sib end");
	}
	public static void main(String[] args) 
	{
		System.out.println("main");
	}
}
//we can the main method calling from intialisers
//main method execute more then one time
// main method required string--null is defualt value any type of array