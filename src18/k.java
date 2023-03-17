class K 
{
	int i;

	K(int i)
	{
		//i=i;//local is assigning to local
		this.i=i;
	}
	public static void main(String[] args) 
	{
		K k1=new K(90);
		System.out.println(k1.i);
	}
}
/*
0
90
if both local and global varaible with name than we will not keep
this keyword inside constructor than complier will consider global varaible.
*/