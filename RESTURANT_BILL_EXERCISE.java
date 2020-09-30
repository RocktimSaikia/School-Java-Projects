import java.util.Scanner;
public class RESTURANT_BILL_EXERCISE {
	public static void main(String args[]){
		double meal_price,tax,tip,total;
		Scanner input = new Scanner(System.in);
		Payment pay = new Payment();
		System.out.print("\nEnter Meal Price : ");
		meal_price = input.nextDouble();
		tax = pay.getTax(meal_price);
		tip = pay.getTip(meal_price);
		total = pay.getTotal(meal_price,tax,tip);
		
		pay.displayBill(meal_price,tax,tip,total);
    }
}
class Payment{
    double TAX_RATE = 0.05;
	double TIP_PERCENT = 0.15;
	
    double getTax(double mealPrice){
		return mealPrice*TAX_RATE;
	}
	double getTip(double mealPrice){
		return mealPrice*TIP_PERCENT;
	}
	double getTotal(double mealPrice,double tax,double tip){
		return mealPrice+tax+tip;
	}
	void displayBill(double mealPrice,double tax,double tip,double total){
		System.out.println("\nTHE BILL :");
		System.out.println("\tTAX AMOUNT..............................$"+tax);
		System.out.println("\tTIP AMOUNT..............................$"+tip);
		System.out.println("\tTOTAL BILL AMOUNT.......................$"+total);
		}
    }
