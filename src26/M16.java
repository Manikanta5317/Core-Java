class  M16
{
	public static void main(String[] args) 
	{
		Object obj=new C();
		System.out.println(obj instanceof Object);
		System.out.println(obj instanceof A);
		System.out.println(obj instanceof B);
		System.out.println(obj instanceof C);
		System.out.println(obj instanceof D);
	}
}
/*
instanceof is boolean type it is used to find current object is original object or not.
*/