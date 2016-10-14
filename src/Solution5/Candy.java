package Solution5;
public class Candy extends DessertItem{
	private float weight;
	private float pricePerPoundDollar;
	
	/*
	 * Constructor: initiate Candy instance
	 * @param name: name of Candy
	 */
	public Candy(String name){
		super(name);
	}
	
	/*
	 * Constructor: initiate Candy instance
	 * @param name: name of Candy
	 * @param weightOfPound: weight of Candy in pound
	 * @param pricePerPoundDollar: the price of Candy in Dollar
	 */
	public Candy(String name, float weightOfPound, float pricePerPoundDollar) {
		this(name);
		this.weight = weightOfPound;
		this.pricePerPoundDollar = pricePerPoundDollar;
	}
	
	/*
	 * Set the weight of Candy
	 * @param: weight: the weight of Candy
	 */
	public float setWeight(float weight){
		return this.weight = weight;
	}
	
	/*
	 * Get the weight of Candy
	 */
	public float getWeight(){
		return weight;
	}
	
	/*
	 * get the cost of Candy
	 */
	@Override
	public int getCost() {
		int costOfCent = Math.round(pricePerPoundDollar * weight * 100);
		return costOfCent;
	}
}


	