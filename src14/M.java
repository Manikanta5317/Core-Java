class M 
{
	static int a;
	public static void main(String[] args) 
	{
		System.out.println(a);//globel a
		a=20;
		System.out.println(a);//globel a
		int a=200;//local a
		System.out.println(a);
		//local have scope within the main method
		//but for globel variable have scope over class M
		//both globel and local visible same location or name -local will be more prefered
	}
	



}
//