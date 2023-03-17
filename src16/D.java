class D 
{
	int i;//Non-static variable

	public static void main(String[] args) 
	{
		D d1=new D();//object creation statement
		//object creation to D class that refered to d1
		System.out.println(d1.i);
	}
}
/*
d1 is D type---any variable of class type --reference variable
d1 is reference variable
Memory vertically divided into two
* stack memory								* heap memory
  Last-in-first output						All objects are storing in heap 
  All method are executing in stack.		Object is creating in heap
  it only for execution purpose
  main method executing in stack,d1 is creating reference to D class
  inside D class we have Non-static variable(i).
*/