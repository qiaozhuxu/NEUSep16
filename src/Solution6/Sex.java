/**
 * 
 */
package Solution6;

/**
 * @author Qiaozhu XU	
 *
 */
public enum Sex {
	MALE(1),
	FEMALE(2),
	SPAYED(3),
	NEUTERED(4);
	
	private final int sexID;
	
	Sex(int value){
		this.sexID = value;
	}
	
	public int getID(){
		return sexID;
	}
	
	public static Sex convertFromId(int id) {
        for (Sex type : Sex.values()) {
            if (type.getID() == id) {
                return type;
            }
        }
        return null;
    }
}
