package Solution5;
public class IceCream extends DessertItem{
	protected int costCent;
	
	/*
	 * Constructor: initiate IceCream instance
	 * @param name: name of IceCream
	 */
	public IceCream(String name) {
		super(name);
	}
	
	/*
	 * Constructor: initiate IceCream instance
	 * @param name: name of IceCream
	 * @param costCent: price of IceCream in cents
	 */
	public IceCream(String name,int costCent) {
		this(name);
		this.costCent = costCent;
	}

	/*
	 * get the cost of Cookie
	 */
	@Override
	public int getCost() {
		return costCent;
	}
}
	
	

