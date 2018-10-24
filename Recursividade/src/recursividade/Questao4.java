
package recursividade;

/**
 *
 * @author samsung
 */
public class Questao4 {
      public static int somvect(int a[], int n){
        if(n==1){
            return a[0];
        }
        else
            return somvect(a,n-1) + a[n-1];
    }
}
