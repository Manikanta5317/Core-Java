class  Q
{
	void test()
	{
		this();
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
/*
error: call to this must be first statement in constructor
                this();
                    ^
this calling statement won't used in methods it only for constructor.
we can't use this calling statement from the methods


*/