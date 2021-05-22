/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TwoThreads3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author C0907I1030
 */
public class Thread2 extends Thread{
     Animal animal;

    public Thread2(Animal animal) {
        this.animal = animal;
    }
    public void run()
    {
        while(true)
        {
            synchronized(animal)
            {
                if(animal.getTrangthai()==2)
                {
                    int i=animal.getIndex();
                    System.out.println(animal.getArr2(i));
                    animal.setTrangthai(1);
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
