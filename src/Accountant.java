
public class Accountant extends Employee {
	private boolean isCPACertified;
	private int CPACertificateId;

	public Accountant(int id, String name, String title) {
		super(id, name, title); // Equivalent to Employee(...)
		isCPACertified = false;
	}
	
	public void certify(int id) {
		this.CPACertificateId = id;
		this.isCPACertified = true;
	}

	@Override
	public void singFavoriteSong() {
		System.out.println("Happy birthday...");
	}
}
