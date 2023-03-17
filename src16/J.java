class J 
{
	int a;

	public static void main(String[] args) 
	{
		J j1=new J();
		j1.a=10;
		System.out.println(j1.a);
		J j2=new J();
		System.out.println(j2.a);
	}
}
/*
For two different object with two different refernce variable 
Non  static members loading to memory for every object creation
stack										heap
j1---->(object J)i=0 modifying to i=10		D new()-1 object
j2---->(object J)i=0(new value)						D new()-2 object

*/