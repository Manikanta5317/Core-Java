package pack1;
class E
{
	private E()
	{
		System.out.println("E()");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		E e1=new E();
		System.out.println("main begin");
	}
}
/*
main begin
E()
main begin
for private member object is create in same class we can't create object other class
*/
