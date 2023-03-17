class I 
{
	public static void main(String[] args) 
	{
		Integer obj1=Integer.valueOf("123s");//s
		System.out.println("Hello World!");
	}
}
/*
it is not possible to convert string o=into integer in which
alphabet and charcaters.
Exception in thread "main" java.lang.NumberFormatException: For input string: "123s"
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        at java.base/java.lang.Integer.parseInt(Integer.java:665)
        at java.base/java.lang.Integer.valueOf(Integer.java:992)
        at I.main(I.java:5)
		NumberFormatException
*/
