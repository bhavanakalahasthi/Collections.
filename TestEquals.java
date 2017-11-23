
public class TestEquals {

	public static void main(String[] args) {
		ItemC item1 = new ItemC(1,"bhavana",100);
		ItemC item2 = new ItemC(1,"bhavana",100);
		
		System.out.println(item1 == item2);
		System.out.println(item1.equals(item2));
		
     String s1= new String("hello");
     String s2= new String("hello");
		
		System.out.println(s1.equals(s2));
	}

}
