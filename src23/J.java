interface J
{
	//J()
	//{
	//}
	//void test()
	//{
	//}
	int a=10;//constant--static and final
	void test1();//abstract method
}
/*
   Error: Main method not found in class J, please define the main method as:
   public static void main(String[] args)
	or a JavaFX application class must extend javafx.application.Application
* interface can become member of java file like class
  for interface also class file is generating.
* Inside interface only for to achieve not concrete or possible abstract ness.
* (interfaces)we can achieve the 100% abstactness .it won't allow sib,iib,constructor.
   J.java:3: error: <identifier> expected
        J()
         ^
	1 error
* Inside a interface we can't develop constructor.it is not possible to develop 
  defined method also inside.
  	 error: interface abstract methods cannot have body
        {
        ^
* No sib,iib ,costructors,define methods inside a interface.
* Inside interface body is possible to develop two type members--constants
   and abstract methods.
* Constants in java--an attribute which is static and final is a constant.
* by default interface attributes are static and final it(static,final)is not mention explicitly.
* In class abstract and concrete methods both they as to key abstract keyword explicitly.
* In interface if method is ending with semicolon(;) by default it is abstract method.
  we won't keep abstract keyword for that method.
* every member of the interface is public by default.interface members are alway
  should be public explicitly.(interface members can not be declare as private or protected).
* In java in which place default acting as public?Inside a interface(interfaces is not public)
  members of interface are public.
* 
*/