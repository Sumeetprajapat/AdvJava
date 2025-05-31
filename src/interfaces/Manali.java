package interfaces;

public class Manali implements HillStation {
	public void location() {
		System.out.println("Manali is in Himachal Pradesh");
	}

	public void famousFor() {
		System.out.println("It is famous for hadimba Temple and adventure sports");
	}
}

class Mussoorie implements HillStation {
	public void location() {
		System.out.println("Mussoorie is in Uttarakhand");
	}

	public void famousFor() {
		System.out.println("It is famous for education institutions");
	}
}

class Gulmarg implements HillStation {
	public void location() {
		System.out.println("Gulmarg is in J&K");
	}

	public void famousFor() {
		System.out.println("It is famous for sking");
	}
}
