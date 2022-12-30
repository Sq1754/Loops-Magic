import java.util.Scanner;

public class Q13_Loops {
	public static void main(String args[]) {
		// Q13-> Write a program to enter numbers till user wants and at the end
		//       it should display the count of +ive,-ive,and zeros entered ?
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Press 1 to continue\nPress 0 to exit");
		
		int positive =0;
		int negative =0;
		int zero =0;
	    int number = sc.nextInt();
	    while(number==1)	{
			System.out.println("Enter your number ");
		    int input = sc.nextInt();
				if(input>0) {
					positive++;
					
				}
				else if(input<0) {
					negative++;
				}
				else { zero++;  }
		
	    System.out.println("Press 1 to continue\nPress 0 to exit");
	    number = sc.nextInt();
	    
	    }
		
		
		System.out.println("Positive number is entered:"+positive+" number of times");
		System.out.println("Negative number is entered:"+negative+" number of times");
		System.out.println(" Zero is entered: "+zero+" number of times");
	}

}
