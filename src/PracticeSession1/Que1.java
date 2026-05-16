package PracticeSession1;

import java.util.Scanner;

public class Que1{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
System.out.println("Enter the amount");
	
	int a=sc.nextInt();
		
		int discount=0;
		if(a>=5000){
			discount=a-(a*15/100);
				System.out.println("The Discount is 15% "+discount);
			}else if(a>=2000){
				discount=a-(a*10/100);
				System.out.println("The Discount is 10% "+discount);
			}else if(a>=1000){
				discount=a-(a*5/100);
				System.out.println("The Discount is 5% "+discount);
			}else if(a<1000){
				discount=a;
				System.out.println("NO Discount");
			}
			System.out.println("Final Discount is "+discount);
		}
		
		
		
		
		
	}
	