/* Napisz program, kt�ry sprawdzi, czy w podanym przez u�ytkownika wyra�eniu
 * arytmetycznym nawiasy s� poprawnie sparowane. Wyra�enie podawane jest jako
 * pojedynczy �a�cuch znak�w. Program powinien wy�wietli� stosowny komunikat.
 * Przyk�ad a:
 * "2 * (3.4 - (-7)/2)*(a-2)/(b-1))"
 * Wynik:
 * B��dne sparowanie nawias�w
 * Przyk�ad b:
 * "2 * (3.4 - (-7)/2)*(a-2)/(b-1)"
 * Wynik:
 * OK 
 */
import java.util.*;
public class Zad5 {
	public static void main(String[] args) {
		int l, i, z=0, w=0;
		char k;
		//boolean a, b;
		String s;
		Scanner ciag = new Scanner(System.in);
		System.out.println("Podaj wyra�enie arytemtyczne: ");
		s = ciag.nextLine();
		l = s.length();
		for(i=0; i<l; i++) {
			k = s.charAt(i);
			if(k=='(') {
				z++;
			}
			if(k==')') {
				w++;
			}
		}
		if(z==w) {
			System.out.println("OK");
		} else {
			System.out.println("B��dne sparowanie nawias�w");
		}
		ciag.close();
	}
}
