package Solution5;
import java.util.Vector;

public class Checkout {
	private static Vector<DessertItem> dessertItemList;
	
	/*
	 * Constructor: Creates a Checkout instance with an empty list of
	 * DessertItems
	 */
	public Checkout(){
		dessertItemList = new Vector<DessertItem>();
	}
	
//	method 1
	public static int numberOfItems(){
		return dessertItemList.size();
	}
//	method 2
	public static void enterItem(DessertItem item){
		dessertItemList.add(item);
	}
//	method 3
	public static void clear(){
		dessertItemList.clear();
	}
//	method 4
	public static int totalCost(){
		int totalCostCent = 0;
		for(DessertItem item : dessertItemList){
			totalCostCent = totalCostCent + item.getCost();
		}
		return totalCostCent;
	}
	
//	method 5
	public static int totalTax(){
		int totalCostCent = totalCost();
		return Math.round(totalCostCent * DessertShoppe.TAX_RATE);
	}
	
//	method 6
	@Override
	public String toString(){
		String result = DessertShoppe.STORE_NAME;
		for(DessertItem item : dessertItemList){
			result = result + " " +item.getName() +" " + DessertShoppe.cents2dollarsAndCents(item.getCost());
		} 
		result += "Tax " + DessertShoppe.cents2dollarsAndCents(Checkout.totalTax());
		result += "Total Cost " + DessertShoppe.cents2dollarsAndCents(totalCost());
		return result;
		
	}
	
}
