import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
			System.out.println("Press ENTER");
			Scanner input = new Scanner(System.in);
			
			input.nextLine();
			
			System.out.println("Vad �r ditt anv�ndanamn?");
			String name = input.nextLine();
			System.out.println("Ditt anv�ndanamn �r: " + name);
			System.out.println("Hur gammal �r du?");
			String age = input.nextLine();
			System.out.println("Du �r: " + age + "�r");
			System.out.println("Din hemadress?");
			String adress = input.nextLine();
			System.out.println("Du bor i: " + adress);
			System.out.println("Vad �r ditt postnummer?");
			String pnummer = input.nextLine();
			System.out.println("Ditt postnummer �r: " + pnummer);
			System.out.println("Vilken stad bor du i?");
			String stad = input.nextLine();
			System.out.println("Du bor i: " + stad);
			System.out.println("Ditt telefonnummer?");
			String telefon = input.nextLine();
			System.out.println("Ditt telefonnummer �r: " + telefon);
			System.out.println("Press ENTER");
			input.nextLine();
			System.out.println("Ditt anv�ndarnamn �r: " + name);
			System.out.println("Du �r: " + age + "�r");
			System.out.println("Du bor i: " + adress);
			System.out.println("Du bor i: "+ adress + pnummer + stad);
			System.out.println("Ditt telefonnummer �r: " + telefon);			
	}

}
