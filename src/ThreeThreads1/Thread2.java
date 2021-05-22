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
public class Thread2 extends Thread{
    Data dt;

    public Thread2(Data dt) {
        this.dt = dt;
    }

    public void run()
    {
        while(true)
        {
            synchronized(dt){
            if(dt.getTrangthai()==2)
            {
                int i=dt.getNum();
                System.out.println("So binh phuong:"+i*i);
                dt.setTrangthai(3);
                dt.notifyAll();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else
            {
                try {
                    dt.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            }
       }
    }
    
}
