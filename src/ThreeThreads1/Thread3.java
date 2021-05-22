/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreeThreads1;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TAID
 */
public class Thread3 extends Thread{
    Data dt;

    public Thread3(Data dt) {
        this.dt = dt;
    }
    public void run()
    {
    while(true)
        {
            synchronized(dt){
            if(dt.getTrangthai()==3)
            {
                int i=dt.getNum();
                System.out.println("So mu bon "+i*i*i*i);
                dt.setTrangthai(1);
                dt.notifyAll();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread3.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else
            {
                try {
                    dt.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread3.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            }
                
        }
    }
}
