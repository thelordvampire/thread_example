/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreeThreads2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TAID
 */
public class Thread3 extends Thread{
    Data data;

    public Thread3(Data data) {
        this.data = data;
    }
    public void run()
    {
        while(true)
        {
            synchronized(data)
            {
                if(data.getTrangthai()==3)
                {
                    System.out.println("Co "+data.getLengthNguyenTo()+" so nguyen to");
                    System.out.println("Va co "+data.getLengthKoNguyenTo()+" so khong nguyen to");
                    data.setTrangthai(1);
                    data.notifyAll();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Thread3.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else
                {
                    try {
                        data.wait();
                        //Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Thread3.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }
    
    
}
