interface A
{
	int i=10;
}
class K
{
	public static void main(String[] args) 
	{
		System.out.println(A.i);
	}
}
/*
* By default interface members are static.without object creation only static memebers are use.
* 10
*/