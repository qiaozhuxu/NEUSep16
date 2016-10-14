package Solution5;

public class DessertShoppe {
	public static final float TAX_RATE = 0.08f;
	public static final String STORE_NAME = "M & M Dessert Shoppe";
	public static final int ITEM_NAME_MAX_LENGTH = 40;
//	constant the width used to display the costs of the items on the receipt.
	
//	method
	public static String cents2dollarsAndCents (int cents){
		float f = (float) cents/100;
		return String.valueOf(f);
	}
}
