import java.util.*; 
  
public class Divisors 
{ 
    public static void main(String args[])
    {
        System.out.println("Enter a positive integer");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count=0, sum=0;
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                count++;
                sum=sum+i;
            }
        }
        System.out.println("Number of divisiors = "+count);
        System.out.println("Sum of divisiors = "+sum);
    }
    
} 