
public class TestBOneMany {

	public static void main(String[] args) {
	ItemC item=new ItemC(1, "bhavana", 100);
	
	Bid[] bidArray = new Bid[3];
	
	bidArray[0] = new Bid(1,20);
	bidArray[0] = new Bid(1,20);
	bidArray[0] = new Bid(1,20);
	item.setBid(bidArray);
	
	

	}

}
