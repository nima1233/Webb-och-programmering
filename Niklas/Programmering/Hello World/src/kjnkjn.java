
public class kjnkjn {

	public static void main(String[] args) {
		
		int heltal = 1;
		int heltal2 = 2;
		float flyttal = 3.14;
		char bokstav = 'c';
		boolean sanning = true;
		
		int summa = heltal + heltal2;
		int produkt = heltal2 / heltal;
		
		if (sanning == true && heltal == 1)
		{
			summa = 0;
		}
		else if (sanning == true || heltal >1)
		{
			summa = 1;
		}
		else
		{
			summa = heltal + heltal2;
		}
		
		for (int i = 0;i == 10; i++)
		{
			summa = summa +i;
		}
		
		while (sanning == true)
		{
			summa ++;
			if (summa >= 40)
			{
				sanning = false;
			}
		}
		
	}

}

