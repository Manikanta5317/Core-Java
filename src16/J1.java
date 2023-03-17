class J1
{
int i;
public static void main(String[] args)
{
	L ref1 = new L();
	L ref2 = new L();
	L ref3 = new L();

	System.out.println(ref1.i + ", " + ref2.i + ", " +
	ref3.i);
	ref1.i = 1;
	ref2.i = 2;
	ref3.i = 3;
	System.out.println(ref1.i + ", " + ref2.i + ", " +
	ref3.i);
	ref1.i = 4;
	System.out.println(ref1.i + ", " + ref2.i + ", " +
	ref3.i);
	ref2.i = 5;
	System.out.println(ref1.i + ", " + ref2.i + ", " +
	ref3.i);
	ref3.i = 6;
	System.out.println(ref1.i + ", " + ref2.i + ", " +
	ref3.i);
}
}
