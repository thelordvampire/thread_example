/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ThreadTime;

/**
 *
 * @author C0907I1030
 */
public class Test {
    public static void main(String[] args) {
        TimeClass time=new TimeClass();
        Thread1 t1=new Thread1(time);
        Thread2 t2=new Thread2(time);
        t1.start();
        t2.start();
    }

}
