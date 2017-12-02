package uebung_5_1;

public class Augenzahlmultiplizieren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int random1;
		int random2;
		int random3;
		int ergebnis [] = new int [216];
		
		for (int i = 1; i<= 1000; i++){
			random1 = Zufall.getZufallInt(1, 6);
			random2 = Zufall.getZufallInt(1, 6);
			random3 = Zufall.getZufallInt(1, 6);
			ergebnis [(random1 * random2 * random3) -1] = ergebnis [(random1 * random2 * random3) -1] + 1;
		}
		for (int index = 1; index < ergebnis.length; index++){
			if (ergebnis[index] > 0){
				System.out.println("Das Ergebis " + (index+1) + " wurde " + ergebnis[index] + " mal gewürfelt.");
		}
		}
		
	}

}
