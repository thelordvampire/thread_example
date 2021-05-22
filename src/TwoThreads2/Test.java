/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TwoThreads2;

/**
 *
 * @author C0907I1030
 */
public class Test {

   
    public static void main(String[] args)
    {
         Data dt=new Data();
        Thread1 t1=new Thread1(dt);
        Thread2 t2=new Thread2(dt);
        t1.start();
        t2.start();
        

    }
}
