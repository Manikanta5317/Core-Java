class Z1 
{
	static void test(String ... varArg,int i)
	{
		System.out.println("from test:" + i);
		System.out.println(varArg.length);
		for(String s1 : varArg)
		{
		System.out.println(s1 + ", ");
		}
		System.out.println();

	}
}
/*
Cp.error
Z1.java:3: error: varargs parameter must be the last parameter
        static void test(String ... varArg,int i)
                                    ^
1 error
*/