package trabajos;

import java.util.Scanner;

public class Trabajo4 {
    public static void main(String[] args) {
        int arreglo[];
        int longitudArreglo=0;
        int aux=0;
        int aux2=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba la cantidad del arreglo deseada");
        longitudArreglo = scanner.nextInt();

        arreglo= new int[longitudArreglo];

        for (int i=0; i<longitudArreglo;i++){
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Ingrese un número");
            aux=scanner.nextInt();
            arreglo[i]=aux;

        }
        scanner.close();

        System.out.println("Este es el resultado de la lista si la ordenamos de menor a mayor");
        for (int i =0; i<longitudArreglo;i++){
            for (int j =0;j<longitudArreglo-1;j++){
                if (arreglo[j]>=arreglo[j+1]){
                    aux=arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=aux;
                }
            }
        }

        for (int i =0;i<longitudArreglo;i++){
            System.out.print(arreglo[i]+" ");
        }


    }
}
