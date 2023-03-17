class Q 
{
	Integer obj;//obj reference type 

	Q()
	{
		int i=obj;//int i=obj.intValue();
		System.out.println(i);
	}
	public static void main(String[] args) 
	{
		Q q1=new Q();
		System.out.println("done");
	}
}
/*
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because "this.obj" is null
        at Q.<init>(Q.java:6)
        at Q.main(Q.java:10)
*/
