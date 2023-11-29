package experiments;

public class childprotected extends parentprotected {
	 protected void name() {   // Multiple markers at this line
		// Cannot reduce the visibility of the inherited method from parentprotected
			// overrides experiments.parentprotected.name
		System.out.println("son");
	}
	public static void main(String[] args) {
		childprotected obj = new childprotected();
		obj.name();
	}

}
