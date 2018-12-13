
import java.util.Scanner;

public class Main {
	Voiture v = null;
	int str = 0;

    public static void main(String[] args) {
		try {
			v = new Voiture();
			Scanner sc = new Scanner(System.in);
			System.out.println("Veuillez saisir le nombre de roue de votre voiture :");
			int str = sc.nextline();
			v(str);
		}
			catch (NombreRoueException | NombreRoue2Exception){    }
			finally {
				if(v == null)
					v = new Voiture();
		}
		v(str);
	}
}
