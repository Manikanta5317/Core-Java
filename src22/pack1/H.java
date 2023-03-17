package pack1;
class E
{
	private E()
	{
		System.out.println("E()");
	}
	E(int i)//Non-private
	{
		System.out.println("E(int)");
	}

}
class H extends E
{
	H()
	{
		super(90);
	}
	public static void main(String[] args) 
	{
	
		System.out.println("main begin");
		//H h1=new H();
		System.out.println("main end");
	}
}
/*
main begin
main end
if class containing all constuctors as private then we can't develop sub class.
if any one constructor is non-private tthen we have chance to develop sub class.
*/