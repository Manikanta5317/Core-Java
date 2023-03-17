class Q 
{
	int i;

	static Q test()//method return type--class(derive data type)
	{
		Q q1=new Q();//q1 is Q type
		q1.i=90;
		System.out.println("from test:" + q1.i);
		return q1;
	}
	public static void main(String[] args) 
	{
		Q obj=test();//obj reference variable
		System.out.println("from main:" + obj.i);
	}
}
/*
q1 test method,obj main method
return q1 is Q datatype
from test:90
from main:90
*/
