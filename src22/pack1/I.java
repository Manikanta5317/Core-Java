package pack1;
class A 
{
	private int p;
}
class I extends A
{

	public static void main(String[] args) 
	{
		I obj=new I();
		System.out.println(obj.p);
	}
}
/*
p has private access in A
                System.out.println(obj.p);

*/