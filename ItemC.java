
public class ItemC implements Cloneable{
private int id;
private String name;
private float price;
private Bid[] bid;
public ItemC()
{
	
}
@Override
	public boolean equals(Object obj) {
	ItemC i2=(ItemC)obj;
		if(i2 != null)
		{
		if((this.id==i2.id)	&& (this.name.equals(i2.name))&&(this.price==i2.price))
				{
			return true;
				}
		}
		return false;
		
}
@Override
	public String toString() {
		return "id ="+id+"\n name="+name+"\nprice="+price;
	}
	@Override
		public Object clone() throws CloneNotSupportedException {
			return super.clone();
		}
public ItemC(int id, String name, float price) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
}

public Bid[] getBid() {
	return bid;
}
public void setBid(Bid[] bid) {
	this.bid = bid;
}
public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
}