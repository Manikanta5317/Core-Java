class P 
{
	public static void main(String[] args) 
	{
		int i=10;
		Integer obj1=i;//auto boxing ,Integer obj1=Integer.valueOf(i);
		Integer obj2=10;//auto boxing
		i=obj1;//auto unboxing
		i=obj2;//auto unboxing   , i=obj2.intValue();
		System.out.println("done");
	}
}
/*
auto boxing and auto unboxing instruded jdk1.5 version.
*/
