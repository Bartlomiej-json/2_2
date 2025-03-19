import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz trzy numery:");
        System.out.print("Pierwszy numer: ");
        int num1 = scanner.nextInt();

        System.out.print("Drugi numer: ");
        int num2 = scanner.nextInt();

        System.out.print("Trzeci numer : ");
        int num3 = scanner.nextInt();

        int highest;

        if (num1 >= num2 && num1 >= num3) {
            highest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            highest = num2;
        } else {
            highest = num3;
        }

        System.out.println("Największą liczbą jest : " + highest);

        scanner.close();
    }
}
