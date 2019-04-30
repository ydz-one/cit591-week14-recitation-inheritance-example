

public class MainRunner {

	public static void main(String[] args) {
		Employee acc = new Accountant(1002, "Devon Boo", "Junior Accountant");
		Employee prof = new TenuredProfessor(1023, "Sam Banner", "Head of School of Architecture");
		
		acc.fire();
		
		Accountant acc1 = (Accountant) acc; // need to cast Employee as an Accountant to be able to call certify()
		acc1.certify(3768004);
		
		prof.fire();
		
		System.out.println(acc.isActive()); // expected false - accountant is fired
		System.out.println(prof.isActive()); // expected true - can't fire tenured professor
	}
}
