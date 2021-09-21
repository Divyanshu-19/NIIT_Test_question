import java.util.Scanner;

public class FirstProblem
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		System.out.println("Enter the amount of money spent:");
		int moneySpent = sc.nextInt();
		
		System.out.println("Enter price of an item:");
		int priceOfAnItem = sc.nextInt();
		
		System.out.println("Enter no. of items bought:");
		int tagsToReturn = sc.nextInt();
		
// 		int totalNoOfItems = ((moneySpent/priceOfAnItem)/10) + tagsToReturn;
        FirstProblem obj = new FirstProblem();
        int totalNoOfItems = obj.freeItem(moneySpent, priceOfAnItem, 0)+tagsToReturn;

        System.out.println("The total No. of items (purchased + free items): "+totalNoOfItems);

        }
        
        //Using Recursion
        public int freeItem(int moneySpent, int price, int noOffreeItem){
        int moneyLeft = moneySpent - price*10;
        if(moneyLeft>=0){
            noOffreeItem = freeItem(moneyLeft, price, noOffreeItem+=1);
        }
        return noOffreeItem;
        }
}
