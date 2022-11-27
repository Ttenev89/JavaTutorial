
public class Lesson4 {
	public static void main(String[] args) {
		aircraft2 cessna = new aircraft2();
		aircraft2 piperSaratoga = new aircraft2();

		cessna.passengers = 4;
		cessna.cruiseSpeed = 140;
		cessna.fuelCapacity = 56.5;
		cessna.fuelBurnRate = 9.5;

		piperSaratoga.passengers = 6;
		piperSaratoga.cruiseSpeed = 201;
		piperSaratoga.fuelCapacity = 102.5;
		piperSaratoga.fuelBurnRate = 20.5;

		System.out.println("Cessna 172 Endurance is: " + cessna.calculateEndurance());
		System.out.println("For Cessna 172 to fly 4.2 hours it takes, " + cessna.fuelNeeded(4.2) + " gallons of fuel.");

		double enduranceSaratoga = piperSaratoga.calculateEndurance();
		System.out.println("\nPiper Saratoga Endurance is: " + enduranceSaratoga);
		System.out.println("For Piper Saratoga to fly 2.5 hours it takes, " + piperSaratoga.fuelNeeded(2.5) + " gallons of fuel.");
	}
}

class aircraft2 {

	int passengers;
	int cruiseSpeed;
	double fuelCapacity;
	double fuelBurnRate;

	double calculateEndurance() {

		double endurance;

		endurance = fuelCapacity / fuelBurnRate;
		
		return endurance;
//		System.out.println("The endurance is " + endurance + " hours.");
	}
	
	double fuelNeeded(double time) {
		return fuelBurnRate * time;
	}
}