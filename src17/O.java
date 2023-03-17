class O 
{
	public static void main(String[] args) 
	{
		O o1=new O(90);
		System.out.println("Hello World!");
	}
}
/*
 error: constructor O in class O cannot be applied to given types;
      O o1=new O(90);
           ^
  required: no arguments
  found:    int
  reason: actual and formal argument lists differ in length
  complier providing no argument constructor by default.
  default consrtructor providing the complier( given in class file)
*/
