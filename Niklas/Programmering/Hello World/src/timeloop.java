import java.util.Scanner;

public class timeloop {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String b = " Abracadabra";

		if (n >= 1 && n <= 100) {
			for (int i = 1; i <= n; i++)
				System.out.println(i + b);
		} else {
			System.out.println("Dumb Cyka");
		}
	}

}
