class G 
{
	public static void main(String[] args) 
	{
		short s1=100;
		double d1=4.5;
		d1=s1;
		//s1=d1;
		s1=(short) d1;//explicit narrowing
		System.out.println("done");
	}
}
/*
done
*/
