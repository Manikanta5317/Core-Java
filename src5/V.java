class V
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		{
			int i=9;
			System.out.println("from if block1-stmt1");
			System.out.println("from if block1-stmt2");
			System.out.println("from if block1-stmt3");
	    }
		{
			System.out.println("from if block2-stmt1:" +i);
			System.out.println("from if block2-stmt2");
			System.out.println("from if block2-stmt3");
	    }
		System.out.println("main end:");
	}
}
