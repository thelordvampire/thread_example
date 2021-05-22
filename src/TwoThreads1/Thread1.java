/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TwoThreads1;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author C0907I1030
 */
public class Thread1 extends Thread{
    DuLieu dl;
    public String name;

    public Thread1(DuLieu dl) {
        this.dl=dl;
    }
    @Override
    public void run()
    {
        while(true)
        {
            synchronized(dl)
            {
                if(dl.getFlag()==1)
                {
                    Random r=new Random();
                    int index=r.nextInt(dl.getLength());
                    dl.setIndex(index);
                    dl.setFlag(2);
                    System.out.println("Thread 1:"+dl.getIndex());
                    dl.notify();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else
                {
                    try {
                        dl.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
            }
        }
    }
}
