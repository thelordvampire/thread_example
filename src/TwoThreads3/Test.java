/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TwoThreads3;

/**
 *
 * @author C0907I1030
 */
public class Test {
    public static void main(String[] args) {
        Animal animal=new Animal();
        Thread1 t1=new Thread1(animal);
        Thread2 t2=new Thread2(animal);
        t1.start();
        t2.start();
    }

}
