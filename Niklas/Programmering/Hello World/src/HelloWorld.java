import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
			System.out.println("Press ENTER");
			Scanner input = new Scanner(System.in);
			
			input.nextLine();
			
			System.out.println("Vad är ditt användanamn?");
			String name = input.nextLine();
			System.out.println("Ditt användanamn är: " + name);
			System.out.println("Hur gammal är du?");
			String age = input.nextLine();
			System.out.println("Du är: " + age + "år");
			System.out.println("Din hemadress?");
			String adress = input.nextLine();
			System.out.println("Du bor i: " + adress);
			System.out.println("Vad är ditt postnummer?");
			String pnummer = input.nextLine();
			System.out.println("Ditt postnummer är: " + pnummer);
			System.out.println("Vilken stad bor du i?");
			String stad = input.nextLine();
			System.out.println("Du bor i: " + stad);
			System.out.println("Ditt telefonnummer?");
			String telefon = input.nextLine();
			System.out.println("Ditt telefonnummer är: " + telefon);
			System.out.println("Press ENTER");
			input.nextLine();
			System.out.println("Ditt användarnamn är: " + name);
			System.out.println("Du är: " + age + "år");
			System.out.println("Du bor i: " + adress);
			System.out.println("Du bor i: "+ adress + pnummer + stad);
			System.out.println("Ditt telefonnummer är: " + telefon);			
	}

}
