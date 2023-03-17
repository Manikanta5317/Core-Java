class J2
{
int i;
public static void main(String[] args)
{
	N n1 = new N();
	N n2 = n1;
	N n3 = n2;
	N n4 = n1;
	System.out.println(n1.i + ", " + n2.i + ", " + n3.i +
	", " + n4.i);
	n1.i = 1;
	System.out.println(n1.i + ", " + n2.i + ", " + n3.i +
	", " + n4.i);
	n2.i += 2;
	System.out.println(n1.i + ", " + n2.i + ", " + n3.i +
	", " + n4.i);
	n3.i += 3;
	System.out.println(n1.i + ", " + n2.i + ", " + n3.i +
	", " + n4.i);
	n4.i += 4;
	System.out.println(n1.i + ", " + n2.i + ", " + n3.i +
	", " + n4.i);
	n4 = null;
	System.out.println(n1.i + ", " + n2.i + ", " + n3.i);
	n3 = null;
	System.out.println(n1.i + ", " + n2.i);
	n2 = null;
	System.out.println(n1.i);
	n1 = null;
	System.out.println(n1.i);
	System.out.println("end");
}
}
