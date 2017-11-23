
public class TestClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		ItemC i1= new ItemC(1, "alex", 1000);
	ItemC i2=(ItemC)i1.clone();
System.out.println(i1.equals(i2));
	}

}
