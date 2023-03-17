public class Z334   
{  
public static void main(String[] args)   
{  
  
//method calling  
int c = add(12,34);   //a and b are actual parameters  
System.out.println("The sum of a and b is= " + c);  
}  
//user defined method  
public static int add(int n1, int n2)   //n1 and n2 are formal parameters  
{  
int  s=n1+n2;  
return s; //returning the sum  
}  
}  