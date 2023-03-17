class Z3 
{
	void test(int[] a)
	{
		System.out.println("Hello World!");
	}
	//void test(int ... b)
	void test1(int ... b)
	{
		System.out.println("Hello iNDIA");
	}
}
/*
Z3.java:7: error: cannot declare both test(int...) and test(int[]) in Z3
        void test(int ... a)
             ^
1 error


Error: Main method not found in class Z3, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application
vararg method can't overloading with array argument.
*/
