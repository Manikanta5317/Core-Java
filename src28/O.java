class O 
{
	final int i;

	O()
	{
		i=10;
	}
	O(String s1)
	{
		i=300;
	}
	public static void main(String[] args) 
	{
		O o1=new O();
		O o2=new O("abc");
		System.out.println(o1.i + ", " + o2.i);
	}
}
/*
hello world!
10,300
one object one constructor is executing,both const. not executing.
final non static global varaible it is not constant for every object ,but it is constant
particular one object.
for the both objects value is not same or may be same.
*/
