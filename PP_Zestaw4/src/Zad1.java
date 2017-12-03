/* Napisaæ program, który wczytuje od u¿ytkownika ci¹g znaków, a nastêpnie 
 * wyœwietla informacjê o tym ile razy w tym ci¹gu powtarza siê jego ostatni znak.
 * Przyk³ad, dla ci¹gu „Abrakadabra” program powinien wyœwietliæ 4, poniewa¿ ostatnim 
 * znakiem jest literka „a”, która wystêpuje w podanym ci¹gu ³¹cznie 4 razy.
 */
import java.util.*;
public class Zad1 {
	public static void main(String[] args) {
		int i, l, m = 0;
		String a;
		char r, k;
		System.out.println("Proszê podaæ ci¹g znaków: ");
		Scanner ciag = new Scanner(System.in);
		a = ciag.nextLine();
		l = a.length();
		k = a.charAt(l-1);
		for(i=0; i<l; i++) {
		r = a.charAt(i);
		
		if(r==k) {
			m++;
		}
		}
		
		System.out.println("Ostatni znak ci¹gu wystêpuje w nim " + m + " razy");
		ciag.close();
	}
}
