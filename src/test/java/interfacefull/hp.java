package interfacefull;

public class hp implements laptop{

	public void copy() {
		
		System.out.println("hp copy");
	}

	@Override
	public void paste() {
		System.out.println("hp paste");
	}

	@Override
	public void cut() {
	
		System.out.println("hp cut");
	}

	@Override
	public void keyword() {
		
		System.out.println("hp keyword");
		
		
	}

}
