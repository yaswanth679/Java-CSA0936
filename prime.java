import java.util.Scanner;
class Prime {

	public static void main(String a[]){
         Scanner s=new Scanner(System.in);
		int i, number, count; 
		System.out.println(" enter n prime numbers ");	
        int n=s.nextInt();
		for(number = 1; number <= n; number++)
		{
			count = 0;
		    for (i = 2; i <= number/2; i++)
		    {
		    	if(number % i == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    }
		    if(count == 0 && number != 1 )
		    {
		    	System.out.print(number + " ");
		    }  
		}
	}
}