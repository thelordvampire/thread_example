/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ThreadTime;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author C0907I1030
 */
public class Thread1 extends Thread{

    TimeClass time;
    public Thread1(TimeClass time) {
        this.time=time;
        
    }

    
    public void run()
    {
        while(true)
        {
            synchronized(time)
            {
                if(time.getTrangThai()==1)
                {
                    
                        Date date = new Date();
                        time.setMinute(date.getMinutes());
                        time.setTrangThai(2);
                        time.notify();

                    
                }
                else
                {
                    try {
                        time.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }

}
