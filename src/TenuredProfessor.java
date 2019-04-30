
public class TenuredProfessor extends Employee {

	public TenuredProfessor(int id, String name, String title) {
		super(id, name, title);
	}
	
	@Override
	public void fire() {
		// Do nothing
	}

	@Override
	public void singFavoriteSong() {
		System.out.println("Jingle bells...");
	}
}
