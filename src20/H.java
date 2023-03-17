class A 
{
	A()
	{
		System.out.println("A()");
	}
}
class H extends A
{
	H()
	{
		super();
		System.out.println("H()");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		H h1=new H();
		System.out.println("main end");
	}
}
/*
main begin
A()
H()
main end
attribute ,methods are involving in inhertance.
A class constructor not inheriting to H class.
constructor not involving in the inheritance.
H class cont giving a call to A class constructor.
In cont body first stmt should be not super calling or this calling,complier will be provide
super.(super no argument constructor)
first stmt should be super or this calling stmt in constructor.

*/