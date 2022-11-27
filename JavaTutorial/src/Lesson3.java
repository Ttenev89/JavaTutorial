
public class Lesson3 {

	public static void main(String[] args) {
		aircraft cessna = new aircraft();
		aircraft piperSaratoga = new aircraft();
		aircraft airbus = new aircraft();

		cessna.passengers = 4;
		cessna.cruiseSpeed = 140;
		cessna.fuelCapacity = 56.5;
		cessna.fuelBurnRate = 9.5;

		piperSaratoga.passengers = 6;
		piperSaratoga.cruiseSpeed = 201;
		piperSaratoga.fuelCapacity = 102.5;
		piperSaratoga.fuelBurnRate = 20.5;

		airbus.passengers = 100;
		airbus.cruiseSpeed = 999;
		airbus.fuelCapacity = 2000;
		airbus.fuelBurnRate = 99;

		System.out.println("Cessna 172 Endurance is: " + cessna.calculateEndurance());
		System.out.println("\nPiper Saratoga Endurance is: " + piperSaratoga.calculateEndurance());
		System.out.println("\nAirbus Endurance is: " + airbus.calculateEndurance());
	}
}

class aircraft {

	int passengers;
	int cruiseSpeed;
	double fuelCapacity;
	double fuelBurnRate;

	double calculateEndurance() {

		double endurance;

		endurance = fuelCapacity / fuelBurnRate;
		
		return endurance;
	}
}
