abstract class G 
{
	G()
	{
	}
}
/*
Error: Main method not found in class G, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application

* Abstract class also should have min one constructor(const. is concrete)
  .No matter object creation or not.
* Any class have min one constructor(normal or abstract class).
* when abstract class const. will execute?when ever creating object to subclass 
  if subclass is concrete.
* constructor can not be abstract?.methods are inheritng to subclass,if can not implement 
  abstract const. by defining the abstract to constructor.
* for giving the abstract keyword to const. it not able use in subclass or no possibe
  to use forever(feature) it should useless feature(no need of giving abstract keyword).
* Abstract is giving for not using now but we are using in feature.
* constructor is not Abstract.
*/
