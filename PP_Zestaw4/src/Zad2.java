/* Napisa� program, kt�ry wczytuje od u�ytkownika ci�g znak�w, a nast�pnie tworzy
 * �a�cuch b�d�cy odwr�ceniem podanego �a�cucha i wy�wietla go na ekranie.
 * Przyk�adowo, dla �a�cucha �Kot� wynikiem powinien by� �a�cuch �toK�.
 */
import java.util.*;
public class Zad2 {
	public static void main(String[] args) {
		int i, l;
		char k;
		String s;
		Scanner ciag = new Scanner(System.in);
		System.out.println("Podaj ci�g znak�w: ");
		s = ciag.nextLine();
		l = s.length();
		for(i=(l-1); i>=0; i--) {
			k = s.charAt(i);
			System.out.print(k);
		}
		ciag.close();
	}
}
