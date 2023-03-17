package pack3;

class E
{
	public static void main(String[] args) 
	{
		//A a1=new A();
		pack2.A a1=new pack2.A();
		System.out.println("Hello World!");
	}
}
/*
pack3\E.java:7: error: cannot find symbol
                A a1=new A();
                ^
  symbol:   class A
  location: class E
  ----------------------------
  Hello world
  ----------------------------
  A is develop in pack2 we need to use in pack3
	A is must public
	we should use along with package or import for using one package member in
	another package.
*/
