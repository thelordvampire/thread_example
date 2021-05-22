/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TwoThreads1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author C0907I1030
 */
public class Thread2 extends Thread{
    String name;
    DuLieu dl;
    public Thread2(DuLieu dl) {
        this.dl=dl;

    }

    public void run()
    {
        while(true)
        {
            synchronized(dl)
            {
                if(dl.getFlag()==2)
                {
                    String name=dl.getName();
                    System.out.println("Thread 2:"+name);
                    dl.setFlag(1);
                    dl.notify();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else
                {
                    try {
                        dl.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }
        }

    }

}
