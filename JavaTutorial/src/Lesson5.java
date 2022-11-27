
public class Lesson5 {

	public static void main(String[] args) {
		air1craft cessna = new air1craft(4, 140, 56.5, 9.5);
		air1craft piperSaratoga = new air1craft(6, 201, 102.5, 20.5);

		

		System.out.println("Cessna 172 Endurance is: " +  cessna.calculateEndurance());
		System.out.println("For Cessna 172 to fly 4.2 hours it takes, " + cessna.fuelNeeded(4.2) + " gallons of fuel.");

		double enduranceSaratoga = piperSaratoga.calculateEndurance();
		System.out.println("\nPiper Saratoga Endurance is: " + enduranceSaratoga);
		System.out.println(
				"For Piper Saratoga to fly 2.5 hours it takes, " + piperSaratoga.fuelNeeded(2.5) + " gallons of fuel.");
	}
}

class air1craft {

	int passengers;
	int cruiseSpeed;
	double fuelCapacity;
	double fuelBurnRate;

	air1craft(int p, int c, double fc, double fbr) {
		// TODO Auto-generated constructor stub
		passengers = p;
		cruiseSpeed = c;
		fuelCapacity = fc;
		fuelBurnRate = fbr;
	}

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
