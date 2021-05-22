/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreeThreads2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TAID
 */
public class Thread1 extends Thread{
    Data data;

    public Thread1(Data data) {
        this.data = data;
    }
    public void run()
    {
        try {
            BufferedReader reader=new BufferedReader(new FileReader("dulieu.txt"));
            String str;
            while(true)
            {
                synchronized(data)
                {
                    if(data.getTrangthai()==1)
                    {
                        str=reader.readLine();
                        Integer num=new Integer(str.trim());
                        System.out.println("Doc dc so"+num);
                        data.setNum(num);
                        data.setTrangthai(2);
                        data.notifyAll();
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
                        }
                       
                        
                    }else
                    {
                        try {
                            data.wait();
                            //Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                    }
                    
                }
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
        }         
    }
    
}
