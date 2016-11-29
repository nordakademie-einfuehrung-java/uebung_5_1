
public class AugenzahlMultiplizieren {

	public static void main(String[] args) {

		int min = 1;
		int max = 6;
		int[] gewuerfelt = new int[max * max * max];
		int i = 0;

		while (i <= 1000) {
			int zahl1 = Zufall.getZufallInt(min, max);
			int zahl2 = Zufall.getZufallInt(min, max);
			int zahl3 = Zufall.getZufallInt(min, max);
			gewuerfelt[zahl1 * zahl2 * zahl3 - 1]++;
			i++;
		}

		for (int j = 0; j < gewuerfelt.length - 1; j++) {
			if (gewuerfelt[j] != 0) {
				System.out.println("Es wurde " + gewuerfelt[j] + "x die " + (j + 1) + " gewürfelt.");
			}
		}
	}
}
