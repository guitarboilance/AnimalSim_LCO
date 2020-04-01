public class Location {
	/**
	 * instantiate coordinate variables
	 */
private int xCoord;
private int yCoord;
	/**
	 * initialize coords as 0 by default
	 */
	//empty argument constructor

	public Location() {
		this.xCoord = 0;
		this.yCoord = 0;
	}//end empty
		/**
		 * passes in x and y coords to preferred constructors utilizing the setters
		 * @param x
		 * @param y
		 * @throws InvalidCoordinateException
		 */
		
	//preferred constructor
	public Location(int x, int y) throws InvalidCoordinateException {
			this.xCoord = x;
			this.yCoord = y;
	}//end preferred
	
	/**
	 * update sets coordinates if x or y aren't less than 0, if one of them is,
	 * InvalidCoordinateException will be thrown and handled
	 * @param x
	 * @param y
	 * @throws InvalidCoordinateException
	 */
	
	//update method
	public void update(int x, int y) throws InvalidCoordinateException {
		try {
			if(x<0 || y<0) {
				throw new InvalidCoordinateException();
			}//end if
			else{
				this.xCoord = x;
				this.yCoord = y;
			}//end else
			}//end try
			catch (InvalidCoordinateException e) {
				System.out.println(e.getMessage());
			}//end catch
	}//end update
	
	/**
	 * gets coordinates from a 2 index int array and returns the array coordinates
	 * @return
	 */
	
	//getCoordinates
	public int[] getCoordinates() {
		int coordinates [] = new int[2];
		coordinates[0] = xCoord;
		coordinates[1] = yCoord;
		
		return coordinates;
		
	}
	
	
}//end location class
