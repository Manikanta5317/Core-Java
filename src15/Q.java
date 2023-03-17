class P
{
	static void test()
	{
		System.out.println("P-test");
	}
	static//static intialisation block
	{
		System.out.println("P-SIB");
	}
}
class Q
{
	static//intialiser
	{
		System.out.println("Q-SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("O-main-begin");
		P.test();
		System.out.println("------------");
		P.test();
		//Q.test();error
		System.out.println("O-main-end");
	}
}
//
/*
Q.java we are loading Q
In Q main method--P is loading to memory
while calling second time P class not loaded
*/