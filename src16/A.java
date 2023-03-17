class A 
{
	int i;//i is Non-static
	public static void main(String[] args) 
	{
		System.out.println(i);
	}
}
//error: Non-static variable i cannot be referenced from a static context
//Non-static member can not using without reference variable.
//we using non-static member with reference
