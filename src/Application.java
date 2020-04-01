import java.util.*;

public class Application {
	
	public static void main(String args[]) throws InvalidCoordinateException, InvalidSimIDException, InvalidWingspanException, InvalidSubspeciesException {
	   /**********************************************
        				Location Tests
        **********************************************/
	
		Location l = new Location();
		//test constructors
		l.update(4,-2);
		System.out.print(Arrays.toString(l.getCoordinates()));
		
		/*********************************************
        				Animal Tests
        *********************************************/

		Animal a = new Animal();
		
		/*********************************************
        				Goldfinch Tests
        *********************************************/
		
		/**
		 * I couldn't figure out how to fix these errors
		 */
		Goldfinch g = new Goldfinch();
		g.setSimID(1);
		System.out.print(Arrays.toString(g.getSimID()));
		g.setxCoord(4);
		System.out.print(Arrays.toString(g.getxCoord()));
		g.setyCoord(7);
		System.out.print(Arrays.toString(g.getyCoord()));
		g.setFull(true);
		System.out.print(Arrays.toString(g.isFull()));
		g.setRested(false);
		System.out.print(Arrays.toString(g.isRested()));
		g.setWingSpan(4);
		System.out.print(Arrays.toString(g.getWingSpan()));
		g.walk(0);
		System.out.print(Arrays.toString(g.getyCoord()));
		g.fly(5, 18);
		System.out.print(Arrays.toString(g.getyCoord()));
		System.out.print(Arrays.toString(g.getxCoord()));
		
		
		
		/*********************************************
        				BrownBear Tests
		*********************************************/

		BrownBear b = new BrownBear();
		b.setSimID(2);
		System.out.print(Arrays.toString(b.getSimID()));
		b.setxCoord(9);
		System.out.print(Arrays.toString(b.getxCoord()));
		b.setyCoord(13);
		System.out.print(Arrays.toString(b.getyCoord()));
		b.setFull(true);
		System.out.print(Arrays.toString(b.isFull()));
		b.setRested(false);
		System.out.print(Arrays.toString(b.isRested()));
		b.setSubSpecies("Alaskan");
		System.out.print(Arrays.toString(b.getSubSpecies()));
		b.walk(1);
		System.out.print(Arrays.toString(b.getyCoord()));
		b.swim(3);
		System.out.print(Arrays.toString(b.getxCoord()));
		
	
	}//end main
	

}//end class
