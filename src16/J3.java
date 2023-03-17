class J3
{
int i;
public static void main(String[] args)
{
	P p1 = new P();
	System.out.println(p1.i);
	p1.i = 10;
	System.out.println(p1.i);
	p1 = new P();
	System.out.println(p1.i);
	p1.i = 20;
	System.out.println(p1.i);
	}
}