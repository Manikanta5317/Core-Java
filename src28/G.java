class G 
{
	int i;
	public static void main(String[] args) 
	{
		final G g1=new G();
		g1.i=10;
		System.out.println("done");
	}
}
/*
Here we are not re-initializing g1 .
g1 is final,i is not final,because that g1 not modify but i is possible.
*/