class F 
{
	public static void main(String[] args) 
	{
		int i=100;
		double j=i;//j double
		//i=j;
		i=(int) j;
		System.out.println("done");
	}
}
/*
complier not doing norrowing operation directly(automatically).
*/
