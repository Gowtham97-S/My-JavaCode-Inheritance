package Polymorphism;

public class MorNew {

	public void mor1() {
		String Name = "Gowtham"; 
		int Phoneno = 487554;       // method without overriding - it we want extend the this class into another class
		String Gmail= "gow@gmail.com";
		System.out.println(Name);
		System.out.println(Phoneno);
		System.out.println(Gmail);
	}
	public static void main(String[] args) {
		MorNew mor = new MorNew();
		mor.mor1();
	}
}
