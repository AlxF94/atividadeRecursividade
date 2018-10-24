
package recursividade;

import java.util.Scanner;

/**
 *
 * @author samsung
 */

public class RecursividadeQ1 {
    public static void main(String[] args) {
        Questao1 q = new Questao1();
        Scanner rec = new Scanner(System.in);
        System.out.println("Informe o Valor do numero que você quer o N fatorial");
        int n = rec.nextInt();
        Questao1.fatorial(n);
    }
    
}
