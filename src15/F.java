class F 
{
	//static int i=F.j;//in direct i=(j=0)
	//static int i=F.j;
	static int j=10;//top-- bottom order
	static int i=F.j;//in direct read
	public static void main(String[] args) 
	{
		System.out.println(i + " ," + j);
	}
}
// direct read not allowed before jvm notified