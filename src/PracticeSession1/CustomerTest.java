package PracticeSession1;

public class CustomerTest {
	public static void main(String[] args){
		
	Customer c=new Customer();
	c.setCustomerid(101);
	c.setCustomername("Alex");
	c.setProduct("Iphone");
	c.setPhonenum(8997412002l);
	
	Customer c1=new Customer();
	c1.setCustomerid(102);
	c1.setCustomername("John");
	c1.setProduct("Oneplush buds");
	c1.setPhonenum(8915784685l);
	
	
	Customer[] cu={c,c1};
	
	for(int i=0;i<=1;i++){
		Customer ct=cu[i];
	System.out.println(ct.getCustomerid());
	System.out.println(ct.getCustomername());
	System.out.println(ct.getProduct());
	System.out.println(ct.getPhonenum());
	System.out.println("-----------------");
		
		
	}
	
	}
	

}
