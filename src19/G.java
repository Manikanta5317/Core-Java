class G 
{
	static int i;

	G()
	{
		i++;
	}
	public static void main(String[] args) 
	{
		G g1=new G();
		G g12=new G();
		G g3=new G();
		G g4=new G();
		System.out.println(i);
	}
}
/*
4
every time value increasing while object is creating.
i is static ,in cont body i value will be incrementing 
*/