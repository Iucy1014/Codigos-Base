
package Ejercicios;

import java.util.Scanner;


public class zMultiplos3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite un número");
        int z = scanner.nextInt();

        System.out.println("Primeros " + z + " múltiplos de 3:");
        for (int i = 1; i <= z; i++) {
            System.out.print(3 * i + " ");
        
    }
}

}
