package com.lara;
class A
{
	public static void main(String[] args) 
	{
		System.out.println("com.lara.A");
	}
}
/*
organizing or partition similer kind of classes keeping in as one group or one unit.
avoiding naming collisions.

 Access levels(Access specifiers or Access modifiers)--Four
	Private:
		> If any member declared as private which should be used within same class.
		> Private members allowed to used within same class.it not used in outside 
		  a current class.
		> Private members not involving in the inheriting.
		> Usage within same class.highly restricted
	Default(without name):
		> No private,without public, without protected.
		> Without any access level
		> Defualt scope through out package.
		> Usage within same package(A,B both are in same package,default scope 
		  members A of can use A in B).
		> Default scope is also called Package scope.
		> Usage and inheritance both are in same package.
	Protected:
		> Protected usage within the same package like default.
		> Protected members can inheriting to any sub class( whether no matter that is same package 
		  or different package).inheritance no limit
		> 
	Public:
	    > Public can be inheritng to any where.
		> Public can used any where.
		> Inheritance any where.
*/