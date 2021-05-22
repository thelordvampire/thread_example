/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TwoThreads2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author C0907I1030
 */
public class Thread2 extends Thread {
    Data dt2;

    public Thread2(Data dt2) {
        this.dt2 = dt2;
    }
    public void run()
    {
        while(true)
        {
            synchronized(dt2)
            {
                if(dt2.getTrangthai()==2)
                {
                    System.out.println(dt2.getNgay());
                    dt2.setTrangthai(1);
                    dt2.notify();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else
                {
                    try {
                        dt2.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }

}
