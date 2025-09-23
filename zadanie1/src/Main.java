import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Zad.1
        double stopnieCelcjusza, stopnieFahrenheita;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę stopni Celsjuszach:");
        stopnieCelcjusza = scanner.nextDouble();
        //
        //Fahrenheita = 1.8 * stopnieCelsjusza + 32.0
        stopnieFahrenheita = 1.8 * stopnieCelcjusza + 32;
        System.out.println("Stopnie Fahrenheita: " + stopnieFahrenheita);
    }
}

