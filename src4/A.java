class A 
{
	public static void main(String[] args) 
	{
		int i=95;
		System.out.println(Integer.toBinaryString(i));
	}
}
/*
   1011111
   95/2=47+r1
   47/2=23+r1
   23/2=11+r1
   11/2=5+r1
   5/2=2+r1
   2/2=1+r0
   1/2=0+r1
*/