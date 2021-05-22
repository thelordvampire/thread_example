/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TAID
 */
public class Thread1 extends Thread{
    
    DuLieu dl;
    Random r=new Random();
    
    public Thread1(DuLieu objData)
    {
        this.dl=objData;
    }
    
    @Override
    public void run()
    {
        while(true)
        {
            synchronized(dl)
            {
                if(dl.isFlag()==false)
                {
                dl.setNumber(r.nextInt(11));
                dl.setFlag(true);
                System.out.println("Thread 1:"+dl.getNumber());
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
