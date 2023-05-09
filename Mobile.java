package day2;

public class Mobile {
	
	int modelNumber=2;
	short noOfMobile=2 ;
	 long meiNumber=12345678;
	 boolean isDamaged=false;
	 String mobileBrandName="oppo";
     float mobilePrice=12000.00f;
     char mobileLogo='&';
    
	 
	
	
	public static void main(String[] args) {
		
		Mobile oppo = new Mobile(); 
		
		System.out.println(oppo.modelNumber);  
		
		 System.out.println(oppo.noOfMobile);
		 
		 System.out.println(oppo.meiNumber);
		 
		 System.out.println(oppo.isDamaged);
		 
         System.out.println(oppo.mobileBrandName);
         
         System.out.println(oppo.mobilePrice);
		 
         System.out.println(oppo.mobileLogo);
	}

}
