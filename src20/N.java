class N
{
	N()
	{
		System.out.println("N()");
	}
	{
		System.out.println("N-IIB");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		N n1=new N();
		System.out.println("main begin");
	}
}
/*
main begin
N-IIB
N()
main begin
if constructor first stmt super calling.iib contents incopareting in the constructor body
immediately after super calling statement.
constructor--
super calling stmt
iib's content
constructor original content.
if first stmt in consructor body is super calling,then iib's content incoparating in
const. body.
*/