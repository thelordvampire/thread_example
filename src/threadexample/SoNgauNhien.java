/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threadexample;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TAID
 */
public class SoNgauNhien extends Thread{
    public void run()
    {
        Random r=new Random();
        while(true)
        {
            System.out.println(r.nextInt(100));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(SoNgauNhien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public static void main(String[] args)
    {
        SoNgauNhien objsnn=new SoNgauNhien();
        objsnn.start();
    }
    
}
