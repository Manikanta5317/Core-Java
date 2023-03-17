class I 
{
	int a;

	public static void main(String[] args) 
	{
		I obj1=new I();
		System.out.println(obj1.a);
		obj1.a=10;
		I obj2=obj1;
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		obj1.a=20;
		System.out.println(obj1.a);
		System.out.println(obj2.a);
	}
}
/*
One object refered by one or more  reference varaible
obj1--->(I object)i=0--->i=10
obj2--->i=20

*/