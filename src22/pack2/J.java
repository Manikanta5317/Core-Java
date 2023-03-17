package pack2;
import pack1.*;
class J
{
public static void main(String[] args)
{
	System.out.println("from J.main");
	K obj = new K();
	K.main(null);
	System.out.println(obj.i);
	obj.test();
}
}
