package Solution5;
public class Cookie extends DessertItem{
	private int number;
	private int pricePerDozenCent;
	
	/*
	 * Constructor: initiate Cookie instance
	 * @param name: name of Cookie
	 */
	public Cookie(String name) {
		super(name);
	}
	
	/*
	 * Constructor: initiate Cookie instance
	 * @param name: name of Cookie
	 * @param num: number of Cookie
	 * @param pricePerDozenCent: the price of a dozen Cookie in cents
	 */
	public Cookie(String name,int num, int pricePerDozenCent) {
		this(name);
		this.number = num;
		this.pricePerDozenCent = pricePerDozenCent;
	}
	
	/*
	 * Set the number of Cookie
	 * @param: num: the number of Candy
	 */
	public int setNumber(int num){
		return this.number = num;
	}
	
	/*
	 * get the cost of Cookie
	 */
	@Override
	public int getCost() {
		int costCent = Math.round(pricePerDozenCent * number / 12);
		return costCent;
	}
}
