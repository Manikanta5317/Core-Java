class M9 
{
	public static void main(String[] args) 
	{
		Object obj=new A();
		//downcasting allowed upto original object . 
		//we can't do downcasting subclass to original object
		//A is subclass to object class,it is possible to downcasting only for original object.
		//downcasting is possible to only for A object.
		A a1=(A) obj;
		System.out.println("-------------");
		B b1=(B) obj;
		System.out.println("--------------");
	}
}
/*
Exception in thread "main" java.lang.ClassCastException: class A 
cannot be cast to class B (A and B are in unnamed module of loader 'app').
*/