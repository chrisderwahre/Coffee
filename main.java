import java.io.IOException;

public class main {

    public static void main(String[] args) throws IOException {
        if (coffee.isEmpty() == true) {
            System.out.println("The Coffee is empty! Please refill!");
            coffee.refill();
        } else {
            System.out.println("The Coffee is full!");
            coffee.drink();
        }
    }
}
