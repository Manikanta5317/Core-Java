class  A
{
	public static void main(String[] args) 
	{
		Integer obj1=Integer.valueOf(10);//boxing
		int i=obj1.intValue();          //unboxing
		System.out.println("done");
	}
}
/*
primitive datatypes             Wrapper classes
-------------------             -------------------
	byte							Byte
	short							Short
	int								Int
	long							Long
	float							Float
	double							Double
	char							Char
	boolean							Boolean
	 for every primitive datatype their is wrapper classes.
	 all wrapper classes starting with cap character first.
	>every wrapper class file avialble in java.lang package.
	 every wrapper class is final.we can't develop subclass for wrapper classes.
	>all wrapper classes implementing Serialzable interface.because of this objects
	 write as files.
	 Because this wrapper object is eligible for write into the file system
	>All wrapper classes implementing Comparable interface.because this wrapper
	 classes eligible for sorting.
	>In wrapper classes object class toString() method is overrided.Because
	 this we print object content through reference varaible.
	>All wrapper classes hashCode() and equals() methods are overrided.Because this
	 duplications can be identify in collection framework.
	>Except Character, wrapper class all other are supporting converting from string
	 to primitive.
	>why do we required  wrapper classes
	-----------------------------------------------------
	  1.Wrapping or Boxing(covering)
	    primitive value storing in object or wrappering primitive content into object
	  2.whatever wrapping content same will be un-wrapping.take primitive value from
	    object.
	  3.converting primitive to String (any primitive converting to string or viceversa)
	  4.String to primitive     (except Character)
	    String may have multiple characters
*/
