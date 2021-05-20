package leetcode;

/*
 * @Author: Niraj Thagunna
 * 
 * Design Parking System
 */
public class ParkingSystem {
	
	// Creating an array that holds all the parking lots available in the parking lots
	private int[] parkingLots;
	
	// Constructor for creating a parking lots
	public ParkingSystem(int big, int medium, int small) {
		// creating an array for holding parking lots
		parkingLots = new int[] {big, medium, small};
	}
	
	// adding a car of specific type in the parking lots
	public boolean addCar(int carType) {
		
		// Checks if the parking lots are available or not
		if (parkingLots[carType - 1] > 0) {
			// Decrementing the number of lots in the parking
			parkingLots[carType - 1]--;
			return true;
		}
		
		// If the parking lots are not available then return false
		return false;
	}
	
	// main method
	public static void main(String[] args) {
		
		try {
			
			// Creating an object of the Parking System to create a parking lots
			ParkingSystem parkingSystem = new ParkingSystem(3, 3, 2);
			
			// Adding the car in the parking lots
			System.out.println("Adding the big car : " + parkingSystem.addCar(1));
			System.out.println("Adding the medium car : " + parkingSystem.addCar(2));
			System.out.println("Adding the small car : " + parkingSystem.addCar(3));
			
//			System.out.println("Remaining parking lots : " + parkingSystem.parkingLots.toString());
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
