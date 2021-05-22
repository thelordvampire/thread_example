/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ThreadTime;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author C0907I1030
 */
public class Thread2 extends Thread{

    TimeClass time;
    public Thread2(TimeClass time) {
        this.time=time;
    }
    public void run()
    {
        while(true)
        {
            synchronized(time)
            {
                if(time.getTrangThai()==2)
                {
                    if(time.getMinute()%2==0)
                        System.out.println("The time is even: "+time.getMinute());
                    else
                        System.out.println("The time is odd: "+time.getMinute());
                    time.setTrangThai(1);
                    time.notify();
                    try
                    {
                        Thread.sleep(1000*60 );
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
                else
                {
                    try {
                        time.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }


}
