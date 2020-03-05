package testInheritAndAbstract;

public class abstractChild2 extends abstractMother{

	public abstractChild2(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		System.out.println(name);
	}
	
}
