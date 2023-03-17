class A
{
	public static void main(String[] args) 
	{
		int i=100;
		double j=i;//double j=(double) i;
		System.out.println("done");
	}
}
/*
> Casting--converting one type to another type
  it won't change the data but it changes the type of data(data remain same).
> Two types of casting:
  primitive casting -
	primitive converting from one numeric to another numeric(primitive)
	 int,short,long,char,float,double,byte,boolean.
	 among all primitive datatype six will be numeric datatypes.
	 byte < short < int < long < float < double
	Under primitive casting--Two types
	 Auto widening - narrower storing in wider
		byte < short < int < long < float < double
		will storing narrower in wider
	 Explicit narrowing - wider one assigning to narrower.
	    byte > short > int > long > float > double(it will explicitly)
		whenever storing wider in narrower
 i is storing in j
*/
