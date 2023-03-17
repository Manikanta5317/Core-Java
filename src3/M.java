class M
{
	public static void main(String[] args) 
	{
		int i=1;
		System.out.println(false && (i++ ==1));//
		//                 false ||  (1 == 1)
		System.out.println(i);//1
	}
}