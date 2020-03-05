package testInheritAndAbstract;

public class abstractChild extends abstractMother{
	public abstractChild(String name) {
		super(name);
	}

	public void print() {
		System.out.println("abstract");
	}
}
