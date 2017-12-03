/* Napisaæ program, który sumuje cyfry w tekœcie podanym przez u¿ytkownika.
 * Przyk³ad:
 * "Ala ma 1 psa i 2 koty. Jola ma 10 rybek i 2 papugi."
 * Wynik:
 * 6
 */
import java.util.*;
public class Zad4 {
	public static void main(String[] args) {
		int l, i, j=0, w;
		char k;
		String s;
		Scanner ciag = new Scanner(System.in);
		System.out.println("Podaj tekst: ");
		s = ciag.nextLine();
		l = s.length();
		for(i=0; i<l; i++) {
			k = s.charAt(i);
			if(k>=48 && k<=58) {
				j = j+k;
			}
		}
		w = (j%48);
		System.out.println("Suma cyfr w tekœcie wynosi: " + w);
		ciag.close();
	}
}
