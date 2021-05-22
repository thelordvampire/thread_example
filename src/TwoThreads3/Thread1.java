/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TwoThreads3;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author C0907I1030
 */
public class Thread1 extends Thread{
    Animal animal;

    public Thread1(Animal animal) {
        this.animal = animal;
    }
    public void run()
    {
        while(true)
        {
            synchronized(animal)
            {
                if(animal.getTrangthai()==1)
                {
                    
                        Random r = new Random();
                        int index = r.nextInt(5);
                        animal.setIndex(index);
                        System.out.print(animal.getArr1(index) + ": ");
                        animal.setTrangthai(2);
                        animal.notify();
                    try
                    {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else
                {
                    try {
                        animal.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }
}
