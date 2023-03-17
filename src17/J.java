class J 
{
	J(int i,int j)
	{
		System.out.println("J(int,int)");
	}
	J(int i,double j)
	{
		System.out.println("J(int,double)");
	}
	public static void main(String[] args) 
	{
		J j1=new J(10,20);
		System.out.println("-----------");
		J j2=new J(10,3.4);
	}
}
/*
J(int,int)
-----------
J(int,double)
one argument should be different
through constructors we will create multiple objects(different object). 
while creating object we need  to specify one the avaliable constructor.
through costructor overloading we can achive mutilpe ways of creating object.
*/