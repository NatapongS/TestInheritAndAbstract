package testInheritAndAbstract;

public class testAll {
	public static void main(String[] args) {
		abstractMother ab;
		abstractChild a1 = new abstractChild("a1");
		abstractChild2 a2 = new abstractChild2("a2");
		ab = a1;
		System.out.print("Child 1: ");
		ab.print();
		System.out.print("Child 2: ");
		ab = a2;
		ab.print();
		normalMother nm = new normalMother("nm");
		System.out.print("mother : ");
		nm.print();
		nm = new normalChild("nc");
		System.out.print("nm(no (child)) :");
		nm.print();
		System.out.print("nm ((child))");
		((normalChild) nm).print();
		System.out.print("nm (private no child)");
		((normalChild)nm).pubic();
		testAll ta = new testTest();
		ta.print();
		((testTest)ta).print();
	}
	private void print() {
		System.out.println("Defalut Private");
	}
}
