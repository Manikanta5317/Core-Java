class S 
{
	static int i=test();//i is datatype
	//method return type and variable datatype both should same
	// all intiallizers are executing before main method
	//globel varaible along with value--intailizier
	static int test()
	{
		System.out.println("from test:" + i);
		return 200;
	}
	public static void main(String[] args) //main method fixed property
	{
		System.out.println("main1: " + i);
		i=20;
		System.out.println("main2:" + i);
	}
}
// public is optional for other methods
//In other methods public should not be mandatary 
//once complete  notify the all intialiser over than main method should be execute

