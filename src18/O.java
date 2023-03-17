class O
{
	O()
	{
		System.out.println("O()");
	}
	O(int i)
	{
		this();
		System.out.println("O(int)");
	}
	public static void main(String[] args) 
	{
		O obj1=new O(45);
		System.out.println("---------");
		O obj2=new O();
		System.out.println("---------");
	}
}
/*
O()
O(int)
---------
O()
---------
from 2nd constructor we are call 1st constructor
we make a call explicitly one ct from another ct
*/
