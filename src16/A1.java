class A1
{
int i;
void test()
{
System.out.println("from test");
}
public static void main(String[] args)
{
A1 a1 = new A1();
System.out.println(a1.i);
//test();//error
A1.test();//error
//a1.test();
}
}