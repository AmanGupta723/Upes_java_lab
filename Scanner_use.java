package java_1;
import java.util.Scanner;
public class Scanner_use
{
    public static void main(String[] args) 
    {
        int n,i;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of subject:");
        n = s.nextInt();
        int marks[] = new int[n];
        System.out.println("Enter marks out of 100:");
        for( i= 0; i < n; i++)
        { marks[i] = s.nextInt();
        }
        for(i=0;i<n;i++)
        {
        	if(marks[i]<50&&marks[i]>40)
        		System.out.println("pass           "+marks[i]);
        	 if(marks[i]>=75)
        		System.out.println("Distinction    "+marks[i]);
        if(marks[i]>50&&marks[i]<75)
        	System.out.println("merit              "+marks[i]);
        }  
}
    }


