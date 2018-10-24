
package recursividade;

/**
 *
 * @author samsung
 */
public class Questao2 {
        int j = 0;
    public int N (int n) {
        if (n == 0) {
            System.out.println(j);
            return j;
        } else {
            if (n == 1) {
                return 1;
            } else {
              return j = N (n - 1) + N (n - 2);

            }
        }
}
}
