class Z 
{
	static void test(int i,String ... varArg)
	{
		System.out.println("from test:" + i);
		System.out.println(varArg.length);
		for(String s1 : varArg)
		{
		System.out.println(s1 + ", ");
		}
		System.out.println();

	}
	public static void main(String[] args) 
	{
		test(90);
		System.out.println("----------");
		test(90,"abc");
		System.out.println("----------");
		test(90,"abc","xyz");
		System.out.println("----------");
		test(90,"abc","xyz","hello");
		System.out.println("----------");
		test(90,"abc","xyz","hello","test");
		System.out.println("----------");
	}
}
/*
varArg is late argument in method argument.
we can't provide more than one varArg arguments.
from test:90
0

----------
from test:90
1
abc,

----------
from test:90
2
abc,
xyz,

----------
from test:90
3
abc,
xyz,
hello,

----------
from test:90
4
abc,
xyz,
hello,
test,

----------
*/

