
abstract class A
{
	abstract void test1();
}

class B
{
	A a1;
	public static void main(String[] args) 
	{
		A obj;//reference variable
		System.out.println("Hello World!");
	}
	void method1(A obj)
	{
	}

	A method2(){
		return a1;
	}
}
/*
where ever datatype required will use abstract class.(datatype purpose we use abstract class)
object creation not possible.
abstract class is used for datatype purpose.
for abstract class we can create reference,argument,
we need create object in class we need to create sub class.
*/
