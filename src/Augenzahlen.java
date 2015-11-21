
public class Augenzahlen {

	public static void main(String[] args) {
	
		int[] ergebnis;
		ergebnis = new int[217];
		
		for (int i = 0; i < 216; i++) {
			ergebnis[i] = 0;
		}
		
		int a;
		int b;
		int c;
		int summe;
		
		for (int i = 0; i < 1000; i++) {
			
			a = Zufall.getZufallInt(1, 6);
			b = Zufall.getZufallInt(1, 6);
			c = Zufall.getZufallInt(1, 6);
			
			summe = a * b * c;
			
			ergebnis[summe] = ergebnis[summe] + 1;
			
		}
		
		for (int i = 1; i <= 216; i++) {
			if (ergebnis[i] == 0) {
				
			} else {
				System.out.println(i + ": " + ergebnis[i]);
			}
		}

	}

}
