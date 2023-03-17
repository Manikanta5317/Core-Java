interface A
{
	int i;//i is final member
}
class L
{
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
/*
  error: = expected
        int i;
* final members are should be intailize while declaring itself.
* every attribute of interface is final ,it should be intialize while declare itself. 
*/