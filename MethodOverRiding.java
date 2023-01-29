package Polymorphism;

public class MethodOverRiding extends MorNew {

	public void mor1() {
		String Name = "Rio";
		int Phoneno = 487554;
		String Gmail = "gow@gmail.com";
		String DOB = "12.05.97";

		System.out.println(Name);
		System.out.println(Phoneno);
		System.out.println(Gmail);
		System.out.println(DOB);
	}

	public static void main(String[] args) {
		MethodOverRiding mor = new MethodOverRiding();
		mor.mor1();
	}

}
