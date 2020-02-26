package java_1;

class Print1 
{
	void print() 
	{
		int i;
		for(i=5;i<=5;i--)
		{
		System.out.println(" "+i);
      }
	}


int sys(int a)
{
	

	int x;

x=a;
System.out.print(" ");
	for (x=4;x<=4;x--)
	{
	
	System.out.println(" "+a);
	
}
	return 0;
}
}

 class Print2 extends Print1
{
   void print()
{
	System.out.println("   3   ");
	
}
int sys(int a,int b)
{
	System.out.println("    1    ");
	return 0;
  }
}
     public class largest
{
	public void main(String argu[])
	{
	Print2 p2 = new Print2();
	Print1 p1 = new Print1();
	p1.print();
	p1.sys(4);
	p2.print();
	p2.sys(1,7);
	}
}
     
	



