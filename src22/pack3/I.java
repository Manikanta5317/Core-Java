package pack3;
import pack2.*;

class I extends A
{
	public static void main(String[] args) 
	{
		I obj=new I();
		System.out.println("Hello World!");
		//System.out.println(obj.p);
		System.out.println(obj.q);
		System.out.println(obj.r);
	}
}
/*pack3\I.java:10: error: p is not public in A; cannot be accessed from outside package
                System.out.println(obj.p);
(p can't use in) default member can't inherited to sub class of other package.
Hello World!
0
0
default member are inhertance and usage in any class of same package.
protected inherting to any subclass.no matter is in same or different package.
it can inherit to any level of subclass,
it acts as a private while inheriting to subclass of another package.
it should be protected within the the subclass while it is inheriting to subclass
of another package.
*/