package testInheritAndAbstract;

public class normalMother {
	String name;
	public normalMother(String name) {
		this.name = name;
	}
	public void print() {
		System.out.println("defalut");
	}
	private void printPrivate() {
		System.out.println("Private Mother");
	}
}
