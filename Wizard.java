
/**
 * This class represents a wizard for
 * a D&D type game.
 * @author Ferdinand K. Yeke
 * @version 1.0
 * Lab 2
 * CS131ON
 *
 */
public class Wizard implements Lockable{
	
	private String name;
	private int health;
	private int key;
	boolean locked;
	
	/**
	 * End constructor to put object into consistent state
	 */
	public Wizard() {
		name = "";
		health = 0;
		key = 0;
		locked = false;
	
	}//end constructor
	
	/**
	 * Constructor to create object with common
	 * usage. This is the preferred constructor.
	 * @param name
	 */
	public Wizard(String name, int health, int key, boolean locked) {
		this.name = name;
		this.health = health;
		this.key = key;
		this.locked = locked;
	}//end constructor
	
	/**
	 * This method processes the 
	 * damage to the object when 
	 * it is hit by other objects
	 * (e.g. weapons, lightening, etc.)
	 * @param power
	 */
	public void takeDamage(int power) {
		int default_Health = health;
		 health = power - health;
		
		if(locked == true)
		{
			this.health = default_Health;
		}
		
		else if(locked != true)
		{
			default_Health = health - power;
		}
		
	}//end takeDamage
	
	/**
	 * Getter for name
	 * @return getName
	 */
	public String getName() {
		return name;
	
	}//end getName
	
	/**
	 * Setter for name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	
	}//end setName
	
	/**
	 * Getter for health
	 * @return
	 */
	public int getHealth() {
		return health;
	}//end getHealth
	
	/**
	 * Setter for health
	 * @param health
	 */
	public void setHealth(int health) {
		this.health = health;
		
	}//end setHealth
	
	/**
	 * Getter for the key
	 * @return
	 */
	public int getKey() {
		return key;
	}//end getKey

	@Override
	public String toString() {
		return "Wizard [name=" + name + ", health=" + health + ", key=" + key + ", locked=" + locked + "]";
	}//end toString
	
	/*The variable setOfkey
	 * holds the actual passed key value
	 * in the parameters
	 */
	int setOfkey;
	@Override
	/*
	 * setKey method starts here
	 * @param key gets passed to see
	 * if the key has been set. If
	 * the key has not been set, then
	 * the key is set by referring to
	 * itself, otherwise it is not set,
	 * but set to 0.
	 * @param key 
	 */
	
	public void setKey(int key) {
		// TODO Auto-generated method stub
		setOfkey = key;
		if(setOfkey>0 && !(this.key == key))
		{
			this.key = key;
		}
		else
		{
			key = 0;
		}
	}//setKey method ends here

	@Override
	/*
	 * lock method starts here
	 * @param key gets passed to check
	 * if it equals setOfKey, if it does,
	 * the key is locked.
	 * @param key
	 */
	
	public void lock(int key) {
		// TODO Auto-generated method stub
		this.key = key;
		this.setOfkey = key;
		if(setOfkey==key)
		{
			locked = true;
		}
		
	}//lock method ends here
	
	@Override
	/*
	 * The unlock method starts here
	 * @param key passes on to the 
	 * method to check if the original
	 * key reference matches that of the
	 * key passed here
	 * @param key
	 */
	public void unlock(int key)
	{
		if(this.key==key)
		{
			locked = false;
		}
		
	}//unlock ends here

	@Override
	/*
	 * The isLocked method starts here
	 * @return locked
	 */
	public boolean isLocked() {
		// TODO Auto-generated method stub
		return locked;
	}//isLocked method ends here
	
}//end class
