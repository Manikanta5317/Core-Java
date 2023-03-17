class I 
{
	static int counter;

	I()
	{

	}

	I(int i)
	{

	}
	I(int i,int j)
	{

	}
	{
		counter++;
	}
	public static void main(String[] args) 
	{
		I i1=new I();
		I i2=new I(12);
		I i3=new I(2,3);
		I i4=new I();
		I i5=new I(4);
		I i6=new I(8,5);
		System.out.println(counter);
	}
}
/*
6
counter keep incrementing for one object creation for one time.
iib situable for only execution for every object creation which having common thing.
*/