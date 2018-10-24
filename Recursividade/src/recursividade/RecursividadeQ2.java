
package recursividade;

import java.util.Scanner;

/**
 *
 * @author samsung
 */
public class RecursividadeQ2 {
   
    public static void main(String[] args) {
        Questao2 q = new Questao2();
        Scanner rec = new Scanner(System.in);
        System.out.println("Informe quantos termos tem nessa sequencia");
        int n = rec.nextInt();
        q.N(n);
    }
}

