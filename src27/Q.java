class A
{
}
class B extends A
{
}
class C extends B 
{
}

class  P
{
	//A test()
	B test()
	{
		return null;
	}
}
class Q extends P
{
	//A test()
	//B test()
	C test()
	//A test() --error
	{
		return null;
	}
}
/*
if super class method return type B ,
in co-variant we can use only subclass name as return type 
in super class method return type.
choosing
*/