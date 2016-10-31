package Solution6;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;

public class AnimalHospital {
	Pet pet = new Pet();
	/* search the list of pets for every pet of a given name, and print the pet’s information, using the toString() method. */
	void printPetInfoByName(String name){
		HashSet<String> petNameList = new HashSet<String>();
		if(petNameList.contains(name)){
			System.out.println(pet.toString());
		}
	}//close printPetInfoByName method
	 
	/* search the list of pets for pets owned by the given person and print the pet’s information for every match, using the toString() method. */
	void printPetInfoByOwner(String name){
		HashSet<String> ownerNameList = new HashSet<String>();
		if(ownerNameList.contains(name)){
			System.out.println(pet.toString());
		}
	}//close printPetInfoByOwner method
	
	/* search the list of pets for every pet boarding at the given time and print the pet’s information for every match, using the toString() method. */
	void printPetsBoarding(int month, int day, int year){
		ArrayList<Date> startBoardingList= new ArrayList<Date>();
		ArrayList<Date> endBoardingList= new ArrayList<Date>();
		Date targetDate = new GregorianCalendar(year, month - 1, day).getTime();
		for(int i = 0; i < startBoardingList.size(); i++){
			if(startBoardingList.get(i).compareTo(targetDate) <= 0 && endBoardingList.get(i).compareTo(targetDate) >= 0){
				System.out.println(pet.toString());
			}
		}
	}


}
