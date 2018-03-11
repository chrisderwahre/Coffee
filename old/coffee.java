import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class coffee {

    public static boolean isEmpty() throws IOException {
        URL url = new URL("http://chrisderwahre.bplaced.net/coffee.txt");
        String data = new Scanner( url.openStream() ).useDelimiter("\\A").next();

        if (data.equals("empty")) {
            return true;
        } else {
            return false;
        }
    }

    public static void refill() {
        System.out.println("Refilling Coffee...");
    }

    public static void drink() {
        System.out.println("Drinking Coffee...");
    }
}
