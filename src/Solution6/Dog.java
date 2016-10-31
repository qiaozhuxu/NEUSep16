package Solution6;


public class Dog extends Pet implements Boardable{
	private String size;
//	Dog's constructor to pass into 4 arguments
	public Dog(String name, String ownerName, String color, String size){
		super(name, ownerName, color);
		this.size = size;
	}
	// returns the string size 
	String getSize(){
		return size;
	}
	/* method that returns a String that identifies the pet as Dog and returns a complete description of the dog, including the values stored in the Pet parent class. */ 
	@Override
	public String toString(){
		return "This is a Dog!" + getPetName() + getOwnerName() + getColor() + getSex() + getSize();
	}
	
	public static void main(String[] args) {
		Dog dogSample = new Dog("Spot","Susan","White","Medium");
		dogSample.setSex(3);
	}
	

}
