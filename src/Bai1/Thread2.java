/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TAID
 */
public class Thread2 extends Thread{
    DuLieu dl;
    public Thread2(DuLieu objData) {
        this.dl=objData;
    }
    public void run()
    {
        while(true)
        {
            synchronized(dl)
            {
                if(dl.isFlag()==true)
                {
                    int number = dl.getNumber();
                    System.out.println("Thread 2:"+number*number);
                    dl.setFlag(false);
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
