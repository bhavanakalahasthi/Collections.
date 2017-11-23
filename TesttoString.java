
public class TesttoString {

	public static void main(String[] args) {
		ItemC item1 = new ItemC(1,"bhavana",100);
		ItemC item2 = new ItemC(1,"bhavana",100);
		System.out.println(item1.toString());
		 
		 String s1= new String("hello");
	     String s2= new String("hello");
	     System.out.println(s1.toString());
	     
	     
	     //return values from override method to string
	     System.out.println(item1.toString());
	}

}
