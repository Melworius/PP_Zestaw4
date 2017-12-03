/* Napisaæ program, który wczytuje od u¿ytkownika ci¹g znaków, a nastêpnie tworzy
 * ³añcuch bêd¹cy odwróceniem podanego ³añcucha i wyœwietla go na ekranie.
 * Przyk³adowo, dla ³añcucha „Kot” wynikiem powinien byæ ³añcuch „toK”.
 */
import java.util.*;
public class Zad2 {
	public static void main(String[] args) {
		int i, l;
		char k;
		String s;
		Scanner ciag = new Scanner(System.in);
		System.out.println("Podaj ci¹g znaków: ");
		s = ciag.nextLine();
		l = s.length();
		for(i=(l-1); i>=0; i--) {
			k = s.charAt(i);
			System.out.print(k);
		}
		ciag.close();
	}
}
