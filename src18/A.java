class A 
{
	void test()
	{
		System.out.println("test:" + this);//"this" is current objects reference variable
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		A a1=new A();
		System.out.println("main:" + a1);
		a1.test();//calling test method by using a1
		//a1 is acting as this in body of a  test method.
		System.out.println("main end");
	}
}
/*
main begin
main:A@2c7b84de
test:A@2c7b84de
main end
class name @ -- Hexadecimal representation of memory address
a1 and this both are refering to same method.
a1 reference variable to  one object from main method same 
is referenced by "this" also.
inside a test method body
this keyword availble  in ever non defination blocks.
*/
