package java_1;
interface A
{
	void meth1();
	void meth2();
}
class MyClass implements A
{
	public void meth1()
	{
		System.out.println("meth1" );
		
	}
	public void meth2()
	{
		System.out.println(" meth2");
	}
}


public class Twomethodinterface {
	public static void main(String args[])
	{
MyClass ob1= new MyClass();
ob1.meth1();
ob1.meth2();
		}
	}