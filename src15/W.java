class W 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(V.i);
		System.out.println("main end");
	}
}
/*
complie search for V class.java but we are saving as test.java, 
not for test.class
javac -d ../classes test.java
javac -d ../classes *.java
A.java:9: error: illegal start of expression
        static void test()
        ^
B.java:8: error: illegal start of expression
        static void test()
        ^
G.java:16: error: class, interface, enum, or record expected
*/
//javac -d ../classes Test.java W.java
//java -cp ../classes W