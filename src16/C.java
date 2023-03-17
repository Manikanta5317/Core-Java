class C 
{
	int i;//i Non static

	public static void main(String[] args) 
	{
		C c1=null;//c1 is reference variable
		System.out.println(c1.i);
	}
}
/*Exception in thread "main" java.lang.NullPointerException: 
Cannot read field "i" because "<local1>" is null
        at C.main(C.java:8). 
c1 is C type--any variable of  class type is called reference variable
		*/
