
public abstract class Employee {
	private int id;
	private String name;
	private String title;
	private boolean isActive;
	
	public Employee(int id, String name, String title) {
		this.id = id;
		this.name = name;
		this.title = title;
		isActive = true;
	}
	
	public boolean isActive() {
		return isActive;
	}
	
	public void fire() {
		isActive = false;
	}
	
	public abstract void singFavoriteSong();
}
