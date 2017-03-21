/**
 * Created by Amaury on 20/03/2017.
 */
import java.util.Scanner;

public class Exercice3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir 2 valeurs");
        System.out.println("valeur 1 :");
        int a = scanner.nextInt();
        System.out.println("valeur 2 :");
        int b = scanner.nextInt();
        int res = a + b;

        System.out.println("Le résultat de l'opération est :");
        System.out.println(res);

    }
}

