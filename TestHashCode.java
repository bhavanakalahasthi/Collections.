
public class TestHashCode {

	public static void main(String[] args) {
		ItemC item1 = new ItemC(1,"bhavana",100);
		ItemC item2 = new ItemC(1,"bhavana",100);
		System.out.println("item1"+item1.hashCode());
		System.out.println("item2"+item2.hashCode());

	}

}
