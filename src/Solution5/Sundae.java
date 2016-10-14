package Solution5;
public class Sundae extends IceCream{
	private int totalCostCent;
	private String toppingName;
	
	/*
	 * Constructor: initiate IceCream instance
	 * @param name: name of IceCream
	 * @param costCent: price of IceCream in cents
	 * @param toppingName: the name of Sundae topping
	 * @param totalCostCent: total cost of Sundae
	 */
	public Sundae(String name, int costCent, String toppingName, int toppingCostCent) {
		super(name,costCent);
		this.toppingName = toppingName;
		this.totalCostCent = toppingCostCent + costCent;
	}
	
	/*
	 * get the cost of Sundae
	 */
	@Override
	public int getCost(){
		return totalCostCent;
	}
}