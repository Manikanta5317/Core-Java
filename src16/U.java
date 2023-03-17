class U
{
int i;
static U test()
{
	U obj = new U();
	obj.i = 5;
	System.out.println("test:" + obj.i);
	return obj;
}
public static void main(String[] args)
{
	System.out.println("main begin");
	U ref = test();
	System.out.println("main end:" + ref.i);
}
}
/*
main begin
test:5
main end:5
*/