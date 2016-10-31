/**
 * 
 */
package Solution6;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author QiaozhuXU
 *
 */
public class Pet implements Boardable {
	private String petName;
	private String ownerName;
	private String color;
	private Sex sex;
	protected Date boardStartDate;
	protected Date boardEndDate;
	private static int count = 0;
	private int petID;

	//default constructor
	Pet(){
		count++;
		this.petID = count + 1;
	}
//	constructor with three arguments(String name, String ownerName, String color)
	Pet(String name, String ownerName, String color){
		count++;
		this.petID = count + 1;
		this.petName = name;
		this.ownerName = ownerName;
		this.color = color;
	}
	
//	public method 
	public String getPetName(){
		return petName;
	}
	
	public String getOwnerName(){
		return ownerName;
	}
	
	public String getColor(){
		return color; 
	}
	
	public void setSex(int sexID){
		sex = Sex.convertFromId(sexID);
	}
	
	public String getSex(){
		return sex.toString();
	}
	
	public int getPetID(){
		return petID;
	}
	// Should return the string equivalent of the gender, e.g the string “MALE” etc. 
	// Should return the name, owner’s name, age, color, and gender (use getSex()); 
	public String toString(){
		return getPetName() + getOwnerName() + getColor() + getSex();
	}
	
//	A Sample (preferred) return value by toString is as follows: 
	public static void main (String[] args){
		Pet petSample = new Pet("Spot","Mary","Black and White");
		petSample.setSex(1);
	}
	
	@Override
	public void setBoardStart(int month, int day, int year){
		boardStartDate = new GregorianCalendar(year, month - 1, day).getTime();
	}
	@Override
	public void setBoardEnd(int month, int day, int year){
		boardEndDate = new GregorianCalendar(year, month - 1, day).getTime();
	}
	@Override
	public boolean boarding(int month, int day, int year){
		Date boardingDate = new GregorianCalendar(year, month - 1, day).getTime();
		
		
		return boardingDate.compareTo(boardStartDate) >= 0 && boardingDate.compareTo(boardEndDate) <= 0;
		
	}
}
