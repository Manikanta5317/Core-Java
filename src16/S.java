class S
{
int i;
static void test1(int p)
{
	System.out.println("test1:"+ p);
	p=20;
}
static void test2(S ref)
{
	System.out.println("test2:"+ ref.i);
	ref.i = 30;
}
public static void main(String[] args)
{
	System.out.println("main begin");

	S s1 = new S();
	s1.i = 5;
	System.out.println("main1:" + s1.i);
	test1(s1.i);
	System.out.println("main2:" + s1.i);
	test2(s1);
	System.out.println("main3:" + s1.i);
	System.out.println("main end");
}
}
/*
main begin
main1:5
test1:5
main2:5
test2:5
main3:30
main end
1. If method argument is a primitive type, then
pass by value effect.
 changes in the destination not reflecting
back to source
2. If method argument is a derived data type
(class type), then pass by reference effect.
 changes in the destination reflecting back to
source
*/