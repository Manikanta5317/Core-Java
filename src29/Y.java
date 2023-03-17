class Y 
{
	static void test(int ... i)
	{
		System.out.println("from int var args:" + i.length);
	}
	public static void main(String[] args) 
	{
		test();
		test(20);
		test(20,30);
		test(20,30,60);
		test(20,40,60,500);
		System.out.println("Hello World!");
	}
}
/*
var arg method is array by default
*/
