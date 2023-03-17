class B 
{
	void test()//non-static
	{
	}

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		test();
	}
}
// error: Non-static method test() cannot be referenced from a static context
//We are using test method directly without reference variable--Error
//Without reference variable we can't use static variable.