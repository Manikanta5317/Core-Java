class S 
{
	S()
	{
		System.out.println("S()");
		this(9);//this calling statement is 2nd stmt in constructor body
	}
	S(int i)
	{
		System.out.println("S(int)");
	}
	public static void main(String[] args) 
	{

		System.out.println("Hello World!");
	}
}
/*
error: call to this must be first statement in constructor
                this(9);
                    ^
this calling statement always should be first statement in constructor body.

*/
