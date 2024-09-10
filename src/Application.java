import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Application {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Rectangle rect = new Rectangle();

        System.out.println("Insira a largura e a altura do retângulo");
        rect.width =  scan.nextDouble();
        rect.height = scan.nextDouble();

        System.out.printf("AREA = %.2f%n", rect.area());
        System.out.printf("PERIMETRO = %.2f%n", rect.perieter());
        System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());






    }
}