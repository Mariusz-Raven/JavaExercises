package Level1;

import java.util.Scanner;

/*Napisz program, który oblicza pole prostokąta. Wartości boków
a i b wprowadzamy z klawiatury. W programie należy przyjąć,
że zmienne a , b oraz pole są typu double (rzeczywistego).*/
public class Ex01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj w programie obliczającym pole prostokąta :)");
        System.out.println("--------");
        System.out.println("Podaj długość boku a:");
        double sideA = scanner.nextDouble();
        System.out.println("Podaj długość boku b:");
        double sideB = scanner.nextDouble();
        System.out.println("Pole prostokąta wynosi: " + sideA * sideB);
    }
}
