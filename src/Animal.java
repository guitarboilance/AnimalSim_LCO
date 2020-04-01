import java.util.*;
public abstract class Animal extends Location { 
	/**
	 * Instantiating variables
	 */
	//empty constructor
	protected int simID;
	protected int xCoord;
	protected int yCoord;
	protected boolean full;
	protected boolean rested;
	/**
	 * default empty arguments
	 */
	public Animal() {
		super();
		this.simID = 0;
		this.xCoord = 0;
		this.yCoord = 0;
		this.full = false;
		this.rested = true;
	}
	/**
	 * passes in params and initiates setters
	 * @param simID
	 * @param xCoord
	 * @param yCoord
	 * @throws InvalidCoordinateException
	 * @throws InvalidSimIDException
	 */
	public Animal(int simID, int xCoord, int yCoord) throws InvalidCoordinateException, InvalidSimIDException {
		super(xCoord, yCoord);
		this.simID = simID;
		this.xCoord = xCoord;
		this.yCoord = yCoord;
		this.full = false;
		this.rested = true;
	}//end preferred
	/**
	 * generates a random number between 0 and 1, if r is greater than .5, the animal ate and is full
	 * if r is .5 or below, the animal didn't eat and isn't full
	 */
	public void eat() {
		Random r = new Random();
			if(r.nextDouble()>.5) {
				setFull(true);
			}
			else {
				setFull(false);
			}
	}//end eat
	/**
	 * generates a random number between 0 and 1, if t is greater than .5, the animal slept and is rested
	 * if t is .5 or below, the animal didn't sleep and isn't rested
	 */
	public void sleep() {
		Random t = new Random();
		if(t.nextDouble()>.5) {
			setRested(true);
		}
		else {
			setRested(false);
		}
	}
	
	//getters and setters
	public int getSimID() {
		return simID;
	}
	/**
	 * passes in simID, if simID is less than or equal to zero, InvalidSimIDException will be thrown,
	 * if it is greater than zero, the simID will be passed into the setter
	 * @param simID
	 */
	public void setSimID(int simID) {
		try {
			if(simID<=0) {
				throw new InvalidSimIDException();
			}//end if
			else {
				this.simID = simID;
			}//end else
			}//end try
			catch (InvalidSimIDException s) {
				System.out.println(s.getMessage());
			}//end catch
	}
	public int getxCoord() {
		return xCoord;
	}
	public void setxCoord(int xCoord) {
		this.xCoord = xCoord;
	}
	public int getyCoord() {
		return yCoord;
	}
	public void setyCoord(int yCoord) {
		this.yCoord = yCoord;
	}

	public boolean isFull() {
		return full;
	}

	public void setFull(boolean full) {
		this.full = full;
	}

	public boolean isRested() {
		return rested;
	}

	public void setRested(boolean rested) {
		this.rested = rested;
	}
	
	
}
