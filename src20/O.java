class O 
{
	O()
	{
		//super()
		this(90,21);
		System.out.println("O()");
	}
	O(int i)
	{
		this();//No super()
		System.out.println("O(int)");
	}
	O(int i,int j)
	{
		System.out.println("O(int)");
	}
	{
		System.out.println("O-IIB");
	}
	public static void main(String[] args) 
	{
		O o1=new O();
		System.out.println("----------");
		O o2=new O(90);
	}
}
/*
O-IIB
O()
----------
O-IIB
O()
O(int)
iib's content only in 1st constrcutor not in 2nd const.
in 2nd execution 2 const. but iib in the 1st const.
O-IIB
O(int)
O()
----------
O-IIB
O(int)
O()
O(int)
cyclic is not allowed.
iib's are part of constructor .constructor not inheriting to sub class.
super constructor don't know any thing related to sub class constructor.that iib's are 
not inheriting to sub class.
*/
