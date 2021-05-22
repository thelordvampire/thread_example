/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreeThreads1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TAID
 */
public class Thread1 extends Thread{
    Data dt;

    public Thread1(Data dt) {
        this.dt = dt;
    }
    
    public void run()
    {
        while(true)
        {
            synchronized(dt){
            if(dt.getTrangthai()==1)
            {
                Random r=new Random();
                dt.setNum(r.nextInt(100));
                System.out.println("So doc duoc "+dt.getNum());
                dt.setTrangthai(2);
                dt.notifyAll();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else
            {
                try {
                    dt.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            }
        }
        }
    
    
}
