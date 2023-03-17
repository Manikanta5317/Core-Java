package pack2;

public class A
{
	int p;//default scope
	protected int q;
	public int r;
}
/*
Default members used in same package(pack2).p is inheritance also within
sub class of pack2(same package).
Q is protected ->usage will also within same package(pack2).q is inheritance to any sub class,
No matter whether sub class in same package or different package.
r is public -> usage and inhertance both will allowed to sub class. No matter whether
sub class is same package odr different package .
*/
