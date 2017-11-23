import java.lang.reflect.Method;

public class TestClass {

	public static void main(String[] args) {
		ItemC item1 = new ItemC(1,"bhavana",100);
		ItemC item2 = new ItemC(1,"bhavana",100);
        
		Class classobj = item1.getClass();
        System.out.println("classname=" +classobj.getName());
        
        Method[] methodarray = classobj.getMethods();
        for(Method method : methodarray )
        {
        	System.out.println(method.getName());
        }
        
        
	}

}
