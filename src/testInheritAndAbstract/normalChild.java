package testInheritAndAbstract;

public class normalChild extends normalMother {
	public normalChild(String name) {
		super(name);
	}
	@Override
	public void print() {
		System.out.println("modified");
	}
	public void printPrivate(){
		System.out.println("Private Child");
	}
	public void pubic() {
		System.out.println("pubic");
	}
	
}
