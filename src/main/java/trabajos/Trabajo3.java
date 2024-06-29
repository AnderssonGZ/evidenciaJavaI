package trabajos;

import java.util.Scanner;

public class Trabajo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba un primer número");
        int num1 = scanner.nextInt();
        System.out.println("Escriba un segundo numero");
        int num2 = scanner.nextInt();
        System.out.println("Escriba un tercer número");
        int num3 = scanner.nextInt();
        scanner.close();
        if (num1 > num2 && num1 > num3) {
            System.out.println("El número mayor es:" + num1);
        } else {
            if (num2 > num3) {
                System.out.println("El número mayor es: " + num2);
            } else {
                System.out.println("El número mayor es:" + num3);
            }
        }
    }
}
