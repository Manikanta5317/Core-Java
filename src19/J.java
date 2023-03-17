class J 
{
	static int i;

	G()
	{
		i++;
	}
	public static void main(String[] args) 
	{
		G g1=new G();
		G g1=new G();
		G g1=new G();
		G g1=new G();
		G g1=new G();
		System.out.println(i);
	}
}
