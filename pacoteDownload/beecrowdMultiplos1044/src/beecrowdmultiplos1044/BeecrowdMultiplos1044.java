/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package beecrowdmultiplos1044;
import java.util.Scanner;

/**
 *
 * @author alxdr
 */
public class BeecrowdMultiplos1044 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int A = teclado.nextInt();
        int B = teclado.nextInt();
        if (A % B == 0 || B % A == 0){
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }
    
}
