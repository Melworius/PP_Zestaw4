/* Napisa� program, kt�ry wczytuje od u�ytkownika ci�g znak�w, a nast�pnie 
 * wy�wietla informacj� o tym ile razy w tym ci�gu powtarza si� jego ostatni znak.
 * Przyk�ad, dla ci�gu �Abrakadabra� program powinien wy�wietli� 4, poniewa� ostatnim 
 * znakiem jest literka �a�, kt�ra wyst�puje w podanym ci�gu ��cznie 4 razy.
 */
import java.util.*;
public class Zad1 {
	public static void main(String[] args) {
		int i, l, m = 0;
		String a;
		char r, k;
		System.out.println("Prosz� poda� ci�g znak�w: ");
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
		
		System.out.println("Ostatni znak ci�gu wyst�puje w nim " + m + " razy");
		ciag.close();
	}
}
