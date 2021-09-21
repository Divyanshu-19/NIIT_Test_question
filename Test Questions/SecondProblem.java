import java.util.Scanner;

public class SecondProblem
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		System.out.println("Enter the day medicine is taken on:");
		int dayOfMedicine = sc.nextInt();
		
		System.out.println("Next dose should be taken after: ");
		int gapDays = sc.nextInt();
		
		int nextDayOfMedicine = (dayOfMedicine+gapDays)%7;
		String dayString="";
		switch(nextDayOfMedicine){
		    case 1: dayString="Sunday";
		            break;
		  
		    case 2: dayString="Monday";
		            break;
		            
		    case 3: dayString="Tuesday";
		            break;
		  
		    case 4: dayString="Wednesday";
		            break;
		            
		    case 5: dayString="Friday";
		            break;
		  
		    case 6: dayString="Saturday";
		            break;
		    
		    case 7: dayString="Sunday";
		            break;
		            
		    default: System.out.println("There is some error with the code");
		}
		
		System.out.println("Your next dose should be taken on "+dayString);
	}
}
