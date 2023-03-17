abstract  class A
{
	void test1()
	{
	}

	abstract void test2();
	abstract void test3();

	void test4()
	{
	}
}
/*
test1 and test4 both define methods or implemented or concret methods.even though no stmts inside.
test2 and test3 both undefined or unimplemented methods.ending with semi colon,this method
declared methods(if we are ending a method semicolon without implement).
all undefined or un implement method abstract keyword is madatory for declared methods.
Abstract keyword should not use if methods is defined.
Abstract method is incompleted method.
without abstract we can not get expert.
if class is containing min one abstract method , then whole class should be declared as abstract.
For abstract class we can't create an object.(object creation not possble for abstract class).
In the classes folder we will develop class file even for abstract class.

*/
