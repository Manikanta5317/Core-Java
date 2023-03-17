class Q
{
	public static void main(String[] args) 
	{
		int i=0;
		System.out.println(!(i++ == 1) || (i++ ==2));//
		//                 !(0 == 1) ||  (1 == 2)
		System.out.println(i);//1
	}
}