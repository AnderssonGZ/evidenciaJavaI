package trabajos;

import java.util.Scanner;

public class Trabajo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba un primer número");
        int num1 =scanner.nextInt();
        System.out.println("Escriba un segundo número");
        int num2 = scanner.nextInt();
        int suma = num1+num2;
        int resta = num1-num2;
        int mult = num1*num2;
        double div = num1/num2;

        System.out.println("La suma de estos dos números es: "+ suma);
        System.out.println("La resta de estos dos números es: "+resta);
        System.out.println("La multiplicacion de estos dos números es: "+mult);
        System.out.println("La division de estos dos números es: "+ div);
    }
}
