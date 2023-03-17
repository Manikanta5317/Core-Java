class A
{
	void test()
	{
		System.out.println("A-test()");
	}
}
class  G extends A
{
	void test()
	{
		System.out.println("test()");
	}
	public static void main(String[] args)
	{
		G g1=new G();
		g1.test();
	}
}
/*
	method overiding(replace -current value changing to new value).
	superclass method while inheriting to subclass ,in subclass we are modifying
	or replacing that with new defination.
	abstract method implements in subclass-- is overiding.
	to achievce overiding require to two classes(superclass to subclass).,it as same signuture 
	with same name.
	subclass method having own method with that of superclass method then only attempt to overiding.
> conditions for overiding:
	return type should be same
	access level should be either same access level of super class method or
	wider to defualt.
	
*/
