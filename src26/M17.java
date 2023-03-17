class M17 
{
	public static void main(String[] args) 
	{
		A a1=new C();
		if(a1 instanceof A)
		{
			System.out.println("converting into A");
			A obj=(A) a1;
		}
		if(a1 instanceof B)
		{
			System.out.println("converting into B");
			B obj=(B) a1;
		}
		if(a1 instanceof C)
		{
			System.out.println("converting into C");
			C obj=(C) a1;
		}
		if(a1 instanceof D)
		{
			System.out.println("converting into D");
			D obj=(D) a1;
		}
	}
}
/*
converting into A
converting into B
converting into C
instanceof operator--if object type is same specified class type then it possible.

*/
