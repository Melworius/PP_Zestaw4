/* Napisaæ program, który wczytuje od u¿ytkownika ci¹g znaków, a nastêpnie sprawdza,
 * czy podany ci¹g jest palindromem. 
 */
import java.util.*;
public class Zad3 {
	public static void main(String[] args) {
		int i, j, l, c;
		char k, m, t=0;
		String s;
		Scanner ciag = new Scanner(System.in);
		System.out.println("Podaj ci¹g znaków: ");
		s = ciag.nextLine();
		l = s.length();
		for(i=0, j=(l-1); i<=j; i++, j--) {
			k = s.charAt(i);
			m = s.charAt(j);
			if(k==m) {
				t++;
			}
		}
		c = (l/2)+(l%2);
		if(t==c) {
			System.out.println("Podany ci¹g jest palindromem.");
		} else {
			System.out.println("Podany ci¹g nie jest palindromem.");
		}
		ciag.close();
	}
}
