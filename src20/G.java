class A 
{
	int i;
	static int j;
	void test1()
	{
		System.out.println("test1");
	}
	static void test2()
	{
		System.out.println("test2");
	}
}
class G extends A
{
	public static void main(String[] args) 
	{
		G g1=new G();
		System.out.println(g1.i);
		System.out.println(G.j);
		g1.test1();
		G.test2();
	}
}
/*
0
0
test1
test2
constructors,iib,sib not inheriting to sub class.
*/