class Test
{
static void method(Object obj)
{
System.out.println("from method begin");

C c1 = (C) obj;
System.out.println("from method end");
}
}
class M23
{
public static void main(String[] args)
{
//Test.method(new E());
System.out.println("--------");
Test.method(new D());
System.out.println("--------");
Test.method(new C());
System.out.println("--------");
Test.method(new B());
System.out.println("--------");
Test.method(new A());
System.out.println("--------");
System.out.println("done");
}
}