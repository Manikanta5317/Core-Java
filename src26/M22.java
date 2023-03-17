class Test
{
	static void method(Object obj)
	{
	System.out.println("from method begin");
	C c1 = (C) obj;
	System.out.println("from method end");
	}
}
class M22
{
public static void main(String[] args)
	{
	Test.method(new A());
	System.out.println("--------");
	Test.method(new B());
	System.out.println("--------");
	Test.method(new C());
	System.out.println("--------");
	Test.method(new D());
	System.out.println("--------");
	//Test.method(new E());
	System.out.println("--------");
	Test.method("abc");
	System.out.println("--------");
	Test.method(20);
	System.out.println("--------");
	Test.method(true);
	System.out.println("--------");
	System.out.println("done");
	}

}
