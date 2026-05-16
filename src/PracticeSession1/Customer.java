package PracticeSession1;

public class Customer{
	
	private int Customerid;
	
	public void setCustomerid(int Customerid){
		this.Customerid=Customerid;
	}
	public int getCustomerid(){
		return Customerid;
	}

	private String Customername;
	public void setCustomername(String Customername){
		this.Customername=Customername;
	}
	public String getCustomername(){
		return Customername;
	}
	private String Product;
	public void setProduct(String Product){
	this.Product=Product;
	}
	
	public String getProduct(){
		return Product;
	}
	private long Phonenum;
	
	public void setPhonenum(long Phonenum){
		this.Phonenum=Phonenum;
	}
	public long getPhonenum(){
		return Phonenum;
	}

	
}