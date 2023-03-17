class E 
{
	int i;

	void test()
	{
		System.out.println("test:" + i);//System.out.println("test:" + this. i);
		i+=90;//this.i+=90;
		//complier will be consider as this.i by default
	}
	public static void main(String[] args) 
	{
		E e1=new E();
		e1.i=10;
		System.out.println("main1:" + e1.i);
		e1.test();
		System.out.println("main2:" + e1.i);
	}
}
/*
main1:10
test:10
main2:100
this aviable in all non static block(this is not explicitly keep)
by default complier replace the (we are keep i)this.i
*/
