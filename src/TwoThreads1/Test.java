/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TwoThreads1;

/**
 *
 * @author C0907I1030
 */
public class Test {
    public static void main(String[] args)
    {
        DuLieu dl=new DuLieu();
        Thread1 t1=new Thread1(dl);
        Thread2 t2=new Thread2(dl);
        t1.start();
        t2.start();

    }

}
