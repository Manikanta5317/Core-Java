package pack2;

class C extends A
{
	public static void main(String[] args) 
	{
		C c1=new C();
		System.out.println(c1.p);//default
		System.out.println(c1.q);//protected
		System.out.println(c1.r);//public
	}
}
/*
Default inhertance to same package.
A and B are in same package.
0
0
0
*/