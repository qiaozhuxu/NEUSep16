package Solution5;

public abstract class DessertItem {
	
	protected String name;
	
	/*
	 * Constructor: initialize DessertItem
	 */
	public DessertItem(){
		
	}
	
	/*
	 * Constructor: initialize DessertItem
	 * @param name: name of the DessertItem
	 */
	public DessertItem(String name){
		this.name = name;
	}
	
	/*
	 * Set the name of DessertItem
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/*
	 * Returns name of DessertItem
	 */
	public String getName(){
		return name;
	}
	
	/*
	 * Returns cost of DessertItem
	 */
	public abstract int getCost();
	
}
