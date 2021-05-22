/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreeThreads2;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TAID
 */
public class Thread2 extends Thread{
    Data data;

    public Thread2(Data data) {
        this.data = data;
    }
    public void run()
    {
        while(true)
        {
            synchronized(data)
            {
                if(data.getTrangthai()==2)
                {
                    boolean flag=true;
                    int num=data.getNum();
                    System.out.println("So nhan dc là :"+num);
                    //data.setTrangthai(1);
                    for(int i=2;i<Math.sqrt(num);i++)
                    {
                        if(num%i==0)
                        {
                            flag=false;
                            break;
                        }
                    }
                    if(flag==true)
                    {
                        try{
                        data.setNguyenTo(num);
                        System.out.println("So nguyen to: "+num);
                        }catch(Exception ex)
                        {
                            System.out.println(ex.getMessage());
                        }
                        try {
                            BufferedWriter writer=new BufferedWriter(new FileWriter("songuyento_"+num+".txt"));
                            writer.write(num);
                        } catch (IOException ex) {
                            Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else
                    {
                        try{
                        data.setKoNguyenTo(num);
                        }catch(Exception ex)
                        {
                            ex.printStackTrace();
                        }
                        System.out.println("So khong nguyen to: "+num);
                        try {
                            BufferedWriter writer=new BufferedWriter(new FileWriter("sokhongnguyento.txt"));
                            writer.write(num);
                        } catch (IOException ex) {
                            Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    data.setTrangthai(3);
                    data.notifyAll();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else
                {
                    try {
                        data.wait();
                   //     Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }
    
}
