class V
{
int i;
public static void main(String[] args)
{
	P p1 = new P();
	System.out.println(p1.i);
	p1.i = 10;
	System.out.println(p1.i);
	p1 = new P();//new object --new reference
	System.out.println(p1.i);
	p1.i = 20;
	System.out.println(p1.i);
}
}
/*
assume reference is pointing to the first object.
assign another object to an existing reference to
remove a reference to the first object.

one reference cant refer to more than one object.
a reference can refer to maximum one object. it
can be 0 number of objects (or) one number
of objects
*/