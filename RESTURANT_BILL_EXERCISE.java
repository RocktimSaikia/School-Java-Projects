import java.util.Scanner;


public class RESTURANT_BILL_EXERCISE {
	private static final double TAX_RATE = 0.05;
	private static final double TIP_PERCENT = 0.15;
	
	public static void main(String args[]){
		double meal_price,tax,tip,total;
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nEnter Meal Price : ");
		meal_price = input.nextDouble();
		tax = getTax(meal_price);
		tip = getTip(meal_price);
		total = getTotal(meal_price,tax,tip);
		
		displayBill(meal_price,tax,tip,total);
	}
		static double getTax(double mealPrice){
			return mealPrice*TAX_RATE;
		}
		static double getTip(double mealPrice){
			return mealPrice*TIP_PERCENT;
		}
		static double getTotal(double mealPrice,double tax,double tip){
			return mealPrice+tax+tip;
		}
		static void displayBill(double mealPrice,double tax,double tip,double total){
			System.out.println("\nTHE BILL :");
			System.out.println("\tBase meal price.........................$"+mealPrice);
			System.out.println("\tTAX AMOUNT..............................$"+tax);
			System.out.println("\tTIP AMOUNT..............................$"+tip);
			System.out.println("\tTOTAL BILL AMOUNT..............................$ : "+total);
		}

}
