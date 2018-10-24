
package recursividade;

import java.util.Scanner;

/**
 *
 * @author samsung
 */
public class RecursividadeQ5 {
    public static void main(String args[]){
        Scanner rec = new Scanner(System.in);
        System.out.println("Informe um valor N");
        int n = rec.nextInt();
        System.out.println("A soma sera de 1 ate o numero digitado");
        Questao5 q = new Questao5();
        q.somInt(n,0);
}
}
