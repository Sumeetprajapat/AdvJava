package interfaces;

public class TestManali {
	public static void main(String[] args) {
		HillStation hill1 = new Manali();
		HillStation hill2 = new Mussoorie();
		HillStation hill3 = new Gulmarg();

		System.out.println("--- Using Interface Reference (Polymorphism) ---");
		hill1.location();
		hill1.famousFor();

		hill2.location();
		hill2.famousFor();

		hill3.location();
		hill3.famousFor();

		HillStation[] stations = { new Manali(), new Mussoorie(), new Gulmarg(), };

		for (HillStation station : stations) {
			station.location();
			station.famousFor();
		}

//		System.out.println("\n--- Using Subclass References ---");
//
//		// ii. Using direct class references
//		Manali manali = new Manali();
//		manali.location();
//		manali.famousFor();
//
//		Mussoorie mussoorie = new Mussoorie();
//		mussoorie.location();
//		mussoorie.famousFor();
//
//		Gulmarg gulmarg = new Gulmarg();
//		gulmarg.location();
//		gulmarg.famousFor();
	}
}
