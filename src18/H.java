class H 
{
	int i;

	H()
	{
		i=100;//this.i=100
	}
	public static void main(String[] args) 
	{
		H h1=new H();
		System.out.println(h1.i);
	}
}
/*
where ever keep i complier provide this.i
100
*/