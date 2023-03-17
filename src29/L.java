/*
class L 
{
	public static void main(String[] args) 
	{
		Boolean b1=Boolean.valueOf("abc");
		boolean b2=b1.booleanValue();
		System.out.println(b2);
	}
}
boolean having two value.
boolean havaing something another thna true it is consider is false.
false
import java.io.*; 
import java.util.*; 
import java.text.*; 
import java.math.*; 
import java.util.regex.*; 
public class L { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :" );
		int n = sc.nextInt(); 
		for(int x=1;x<11;x++) 
			{ 
			//System.out.println(n + " x " + x +  " = " + (n*x));
			System.out.printf("%d x %d = %d\n",n,i,n*i); 
			//System.out.println();
			} 
	}
}
*/
import java.util.Scanner;


public class L {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {//i<2
            int a = in.nextInt();//a=0,a=5
            int b = in.nextInt();//b=2,b=5
            int n = in.nextInt();//n=10,n=5
            int temp = a;
            for (int j = 0; j < n; j++) {
                temp += (Math.pow(2, j) * b);
                System.out.print(temp + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
/*
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
t=0
temp=temp+(2^j * b);
temp=0
temp=0+(2^0 *2)=2
temp=2+(2^1 *2)=6
temp=6+(2^2 *2)=14
*/
