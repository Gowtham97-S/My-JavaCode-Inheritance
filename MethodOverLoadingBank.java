  package Polymorphism;

public class MethodOverLoadingBank {
	
	public void form(String Name,int phoneno,String gmailID ) {
		System.out.println("Fill-Form:");
	System.out.println("1.Name - "+Name);
	System.out.println("2.Phone No - "+phoneno);
	System.out.println("3.Mail ID - " +gmailID);
		
	}
	
	public void form(String Name,int phoneno1,int phoneno2,String gmailID ) {
		System.out.println("Fill-Form:");
	System.out.println("1.Name - "+Name);           //methode overloaded 
	System.out.println("2.Phone No 01 - "+phoneno1);
	System.out.println("3.Phone No 02 - "+phoneno2);
	System.out.println("4.Mail ID - " +gmailID);
		
	}
	
	public static void main (String[]args) {
		MethodOverLoadingBank form1 = new MethodOverLoadingBank();
		form1.form("Gowtham",4857,"gow@gmail.com");
		System.out.println("------");
		form1.form("Rio",4854,9874,"rio@gmail.com");
	}

}
