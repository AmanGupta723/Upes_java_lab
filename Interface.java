package java_1;
interface test
{
	int square();
}

class arithmetic implements test
{
	int p;

	arithmetic(int i)
	{
		p = i;
	}

	public int square()
	{
		return (p*p);
	}
	
}
class ToTestInt
{
	public int return_ans(int x)
	{
		arithmetic ob =new arithmetic(x);
		return ob.square();
	}
}
public class Interface {

	public static void main(String []args)
	{
		ToTestInt x= new ToTestInt();
		System.out.println("\nThe square of 6 is "+x.return_ans(6));
	}
}