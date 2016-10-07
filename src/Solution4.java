import java.util.ArrayList;
import java.util.List;

public class Solution4 {
	/**2. Implement Class MusicAlbum which encapsulated a music Album, each album has a string variable albumTitle and a String variable singer 
	representing the name of singer, double variable price representing the price of album, 
	objects of this class are Initialized using all of its instance variables.
	The class has accessor methods for all its Variables and a mutator method for price.**/

	class MusicAlbum {
			private String albumTitle;
			private String singer;
			private double price;
			
			public MusicAlbum(String albumTitle, String singer, double price){
				this.albumTitle = albumTitle;
				this.singer = singer;
				this.price = price;
			}
			
//			Accessor method
			public String getAlbumTitle(String title){
				return albumTitle;
			}
			public String getSinger(String name){
				return singer;
			}
			public double getPrice(double p){
				return price;
			}
//			Mutator method
			public void setPrice(double p){
				this.price = p;
			}
	}
	
	/**3. Write a class named GasTank containing:
		An instance variable named amount of type double, initialized to 0.
		A method named addGas that accepts a parameter of type double . 
		The value of the amount instance variable is increased by the value of the parameter.
		
		A method named useGas that accepts a parameter of type double . 
		The value of the amount instance variable is decreased by the value of the parameter.
		
		A method named getGasLevel that accepts no parameters. 
		getGasLevel returns the value of the amount instance variable.**/
	class GasTank{
		private double amount = 0;
		
		public double addGas(double gasV){
			amount = this.amount + gasV;
			return amount;
		}
		public double useGas(double gasV){
			amount = this.amount - gasV;
			return amount;
		}
		public double getGasLevel(){
			return this.amount;
		}
	}
	
	/**4. Design and implement a class called Car.You need to create necessary attributes for this class, and method if needed
	Define the Car constructor to initialize these values (in that order).
	 Include getter and setter methods for all instance data.**/
	class Car{
		private String model;
		private String brand;
		private double msrp;
		private int modelYear;
		
		public Car(String model, String brand, double msrp, int modelYear){
			this.model = "CAMRY";
			this.brand = "TOYOTA";
			this.msrp = 20000.00;
			this.modelYear = 2016;
		}
		public Car(){
			this("CAMRY", "TOYOTA", 20000.00, 2016);
		}
		
		public Car(String brand){
			this.brand = brand;
		}
		
		public String getModel(){
			return this.model;
		}
		public String getBrand(){
			return this.brand;
		}
		public double getMsrp(){
			return this.msrp;
		}
		public int getModelYear(){
			return this.modelYear;
		}
		
	}
	
	/**5. Combine with problem 3 and 4, define a class named Driver that 
	 * contains methods like drive and addGas so that the driver can drive the car.**/
	class Driver{
		private String driverName = "Serena";
		
		public String getDriverName(){
			return this.driverName;
		}
		Car car = new Car();
		GasTank gasTank = new GasTank();
		public void driveCar(String name){
			System.out.println("Driver " + this.driverName);
			System.out.println("the car's brand is" + car.getBrand());
			System.out.println("the car used to has " +gasTank.getGasLevel() +" gal of fuel");
			System.out.println("She added 18 gal of fuel and now the car has"+ gasTank.addGas(18)+"gal of fuel");
		}
	}
	
	/**Bonus: 
	Design a java class that encapsulate the data structure Stack (Last in First out). The class has 2 methods:
	(push): method for adding items to stack, the push operation adds items to the top of the list
	(pop): method for retrieving items from the stack. The pop operation removes an item from the top of the list,
	and returns its value to the caller.
	In the case of overflow the user should be informed with a message
	In the case of underflow, the user should be informed with a message & a value of zero is returned.

	Assumptions: The stack will hold up to 10 integer values.**/
	class Stack {
		private List<Integer> stack = new ArrayList<Integer>();
		
		public void push(int newNumber){
			if(stack.size() >= 10){
				System.out.println("the stack is overflowed!");
			}else{
				stack.add(0,newNumber);
			}
		}
		public int pop(){
			if(stack.isEmpty()){
				System.out.println("the stack is underflowed!");
				return 0;
			}else{
				int result = stack.get(0);
				stack.remove(0);
				return result;
			}
		}
		
	}
}
