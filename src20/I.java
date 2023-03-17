class A extends Object
{
	A()
	{
		System.out.println("A()");
	}
}
class B extends A
{
	B()
	{
		System.out.println("B()");
	}
}
class I extends B
{
	I()
	{
		System.out.println("I()");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		I obj1=new I();
		System.out.println("main end");
	}
}
/*
main begin
A()
B()
I()
main end
in construtor first stmt should be super or this call stmt.
it will not inside cost. complier providing super (calling stmt) with no argument.
if they is class without extends keyword like class A complier provide extends object.
object class is one of the built-in one class(already avliable in jdk).it is super most class for every class.
object class contains members which are required for  every class.
class person --9 methods(mandatory methods).this is already 
Object class containing only one constructor and it No argument constructor,
Inside this construtor no super calling.
"Constructor chain"---I()--B()---A()---Object class c
*/
