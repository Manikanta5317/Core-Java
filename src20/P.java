class A 
{
	static
	{
		System.out.println("A-SIB");
	}
}


class P extends A
{
    static
	{
		System.out.println("P-SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("from main");
	}
}
/*
A-SIB
P-SIB
from main
A-sib not inheriting to sub class
P depend on A(P is sub class of A )without A ,P can't be survive.
while loading P to memory A as to loading.
*/
