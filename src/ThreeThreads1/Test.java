/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreeThreads1;

/**
 *
 * @author TAID
 */
public class Test {
    public static void main(String[] args)
    {
        Data dt=new Data();
        Thread1 t1=new Thread1(dt);
        Thread2 t2=new Thread2(dt);
        Thread3 t3=new Thread3(dt);
        t1.start();
        t2.start();
        t3.start();
    }
    
}
