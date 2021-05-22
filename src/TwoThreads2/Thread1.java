/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TwoThreads2;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author C0907I1030
 */
public class Thread1 extends Thread {
    Data dt1;

    public Thread1(Data dt1) {
        this.dt1 = dt1;
    }

    public void run()
    {
        while(true)
        {
            synchronized(dt1)
            {
                if(dt1.getTrangthai()==1)
                {
                    Random r=new Random();
                    dt1.setIndex(r.nextInt(7));
                    System.out.println("Thread 1:"+dt1.getSo());
                    dt1.setTrangthai(2);
                    dt1.notify();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
                else
                {
                    try {
                        dt1.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }
}
