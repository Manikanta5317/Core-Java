class T
{
int i;
static void test(T t1, T t2)
{
	System.out.println("test:" + t1.i + ", " +  t2.i);//110,60
	//System.out.println("test:" + t1.i +", "
	int i = t1.i; // 10,110
	t1.i = t2.i; // 20,60
	t2.i = i; // 10
}
public static void main(String[] args)
{
	System.out.println("main begin");
	T ref1 = new T();
	ref1.i = 10;
	T ref2 = new T();
	ref2.i = 20;
	System.out.println("main1:" + ref1.i + ", " +
	ref2.i);
	test(ref1, ref2);
	System.out.println("main2:" + ref1.i + ", " +
	ref2.i);
	ref1.i += 30 + ref2.i; //60
	ref2.i += 40 + ref1.i; // 110
	test(ref2, ref1);
	//test(ref1, ref2);
	System.out.println("main3:" + ref1.i + ", " +
	ref2.i);
	System.out.println("main end");
}
}
