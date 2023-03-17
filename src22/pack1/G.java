package pack1;
class E
{
	private E()
	{
		System.out.println("E()");
	}
}
class G extends E
{

	public static void main(String[] args) 
	{
		//default constructor
		System.out.println("main begin");
		//sub class have calling stmt that is default cost. with no argument super calling
		System.out.println("main begin");
	}
}
/*
 error: E() has private access in E
class G extends E
inside G class by default constructor with super calling stmt which call to
E class constructor(private ).that can't call from outside a class.
every member should can be syntatically correct
*/