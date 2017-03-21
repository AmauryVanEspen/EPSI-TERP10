import java.io.InputStream;

/**
 * Created by Amaury on 21/03/2017.
 */
public class Exercice5 {
    static boolean a = true;
    static boolean b = false;

    public static void main(String[] args) {
        System.out.println(((a && b) || !a ) && !b);
        System.out.println(!a && !b);
        System.out.println(!(a||b));

    }
}
