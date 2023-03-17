class Z43
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
	    int i=1;
		int j=test(i++ + i);
		//System.out.println("main end:");
		System.out.println("main end:" + i + ", " + j);
	}
	public static int test(int i) 
	{
		
		System.out.println("from test:" + i );
		return ++i;
	}
}
//i=1---j=test(i++ +i)=3---int i=3----return i=4---
//i,j=2,4
// from test= 3