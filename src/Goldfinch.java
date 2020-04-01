public class Goldfinch extends Animal implements Flyable, Walkable {
	/**
	 * initiates variables
	 */
	private int simID;
	private int xCoord;
	private int yCoord;
	private boolean full;
	private boolean rested;
	private double wingSpan;
	/**
	 * instantiates variables to default values
	 */
	public Goldfinch() {
		super();
		this.simID = 0;
		this.xCoord = 0;
		this.yCoord = 0;
		this.full = false;
		this.rested = true;
		this.wingSpan = 9.0;
	}//end empty
	/**
	 * instantiates variables to passed in parameters utilizing the setters
	 * @param simID
	 * @param xCoord
	 * @param yCoord
	 * @param wingSpan
	 * @throws InvalidCoordinateException
	 * @throws InvalidSimIDException
	 */
	public Goldfinch(int simID, int xCoord, int yCoord, double wingSpan) throws InvalidCoordinateException, InvalidSimIDException {
		super(simID, xCoord, yCoord);
		this.simID = simID;
		this.xCoord = xCoord;
		this.yCoord = yCoord;
		this.wingSpan = wingSpan;
		this.full = false;
		this.rested = true;
		
	}//end preferred
	
	/**
	 * fly passes in x and y coords and sets the new coords with the setters
	 */
	
	public void fly(int xCoord, int yCoord) {
		setxCoord(xCoord);
		setyCoord(yCoord);
	}//end fly
	
	/**
	 * walk passes in an integer containing 4 possible movement directions, changing the goldfinch's coords by 1 based on which int is passed in 0-3
	 */
	
	public void walk(int direction) {
			switch(direction) {
			case 0:
				setyCoord(yCoord+1);
				break;
			case 1:
				setyCoord(yCoord-1);
				break;
			case 2:
				setxCoord(xCoord-1);
				break;
			case 3:
				setxCoord(xCoord+1);
				break;
			default:
			}
	}
	

	public int getSimID() {
		return simID;
	}

	public void setSimID(int simID) {
		this.simID = simID;
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

	public double getWingSpan() {
		return wingSpan;
	}
	/**
	 * setWingSpan passes in the wingSpan double. If wingSpan is less than 5 or greater than 11,
	 * InvalidWingspanException will be thrown and handled
	 * otherwise,wingSpan is passed into the setter
	 * @param wingSpan
	 * @throws InvalidWingspanException
	 */

	public void setWingSpan(double wingSpan) throws InvalidWingspanException {
		try {
			if(wingSpan<5.0||wingSpan>11.0){
				throw new InvalidWingspanException();
			}
			else {
				this.wingSpan = wingSpan;
			}//end else
		}//end try
		catch (InvalidWingspanException w) {
			System.out.println(w.getMessage());
		}//end catch
	}
}//end class
