class F 
{
	F()
	{
		System.out.println("constructor:" + this);
	}
	public static void main(String[] args) 
	{
		F f1=new F();
		System.out.println("main:" + f1);
	}
}
/*
constructor:F@2c7b84de
main:F@2c7b84de
constructor is Non defination block
while object creating reference  f1(this is avliable inside C.body)
 to the Non D.B is avliable in the constructor body .

*/
