public class BrownBear extends Animal implements Walkable, Swimmable {
	/**
	 * initializes variables
	 */
	private int simID;
	private int xCoord;
	private int yCoord;
	private boolean full;
	private boolean rested;
	private String subSpecies;
	/**
	 * instantiates variables to default values utilizing setters
	 */
	public BrownBear() {
		super();
		this.simID = 0;
		this.xCoord = 0;
		this.yCoord = 0;
		this.full = false;
		this.rested = true;		
		this.subSpecies = "Alaskan";
	}
	/**
	 * passes in parameters to the preferred constructors utilizing setters
	 * @param simID
	 * @param xCoord
	 * @param yCoord
	 * @param subSpecies
	 * @throws InvalidSimIDException
	 * @throws InvalidCoordinateException
	 * @throws InvalidSubspeciesException
	 */
	public BrownBear(int simID, int xCoord, int yCoord, String subSpecies) throws InvalidSimIDException, InvalidCoordinateException, InvalidSubspeciesException {
		super(simID, xCoord, yCoord);
		this.simID = simID;
		this.xCoord = xCoord;
		this.yCoord = yCoord;
		this.subSpecies = subSpecies;
		this.full = false;
		this.rested = true;
	}
	/**
	 * walk passes in an integer containing 4 possible movement directions, changing the BrownBear's coords by 1 based on which int is passed in 0-3
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
	
	/**
	 * swim passes in an integer containing 4 possible movement directions, changing the Brownbear's coords by 2 based on which int is passed in 0-3
	 */
	
	public void swim(int direction) {
		switch(direction) {
			case 0:
				setyCoord(yCoord+2);
				break;
			case 1:
				setyCoord(yCoord-2);
				break;
			case 2:
				setxCoord(xCoord-2);
				break;
			case 3:
				setxCoord(xCoord+2);
				break;
			default:
		}
	}
	
	
	//getters and setters
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
	public String getSubSpecies() {
		return subSpecies;
	}
	/**
	 * if one of the valid subSpecies strings is passed in, it will set the setter to that subSpecies
	 * if no valid subSpecies string is passed in, InvalidSubspeciesException is thrown and handled
	 * @param subSpecies
	 * @throws InvalidSubspeciesException
	 */
	public void setSubSpecies(String subSpecies)throws InvalidSubspeciesException {
		try {
			switch (subSpecies) {
				case ("Alaskan"):
					this.subSpecies = "Alaskan";
					break;
				case "Asiatic":
					this.subSpecies = "Asiatic";
					break;
				case "European":
					this.subSpecies = "European";
					break;
				case "Grizzly":
					this.subSpecies = "Grizzly";
					break;
				case "Kodiak":
					this.subSpecies = "Kodiak";
					break;
				case "Siberian":
					this.subSpecies = "Siberian";
					break;
				default:
					throw new InvalidSubspeciesException();
			}//end switch
		}//end try
		catch (InvalidSubspeciesException ss) {
			System.out.println(ss.getMessage());
		}//end catch

	}//end setSubSpecies

}//end class
