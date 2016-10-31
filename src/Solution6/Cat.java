package Solution6;


public class Cat extends Pet implements Boardable {
	private String hairLength;
	//	constructor with 4 arguments to pass into
	public Cat(String name, String ownerName, String color, String hairLength) {
		super(name, ownerName, color);
		this.hairLength = hairLength;
		// TODO Auto-generated constructor stub
	}
	// returns the string hairLength 
	public String getHairLength(){
		return hairLength;
	}
	/* method that returns a String that identifies the pet as Cat and returns a complete description of the cat, including the values stored in the Pet parent class.*/ 
	@Override
	public String toString(){
		return "This is a cat!" + getPetName() + getOwnerName() + getColor() + getSex() + getHairLength();
	}
	
	
	public static void main(String[] args) {
		Cat catSample = new Cat("Tom","Bob","Black","Short");
		catSample.setSex(3);
	}

}
