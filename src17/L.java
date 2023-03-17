class L 
{
	public static void main(String[] args) 
	{
		L obj1=new L(90);
		System.out.println("Hello World!");
	}
}
/*
 error: constructor L in class L cannot be applied to given types;
                L obj1=new L(90);
                       ^
  required: no arguments
  found:    int
  reason: actual and formal argument lists differ in length
  which ever constructor using while object is creating that constructor willbe avlaible.
*/
