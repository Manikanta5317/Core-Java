class F
{
	public static void main(String[] args) 
	{
		final int[] elements=new int[10];
		//size is 10
		elements[1]=4;
		System.out.println("done");
	}
}
/*
> Here we are trying to modify index of element .but elements are not modify
> elements are final it can't be modify,but index number will modified
*/