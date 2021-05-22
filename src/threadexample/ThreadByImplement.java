/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threadexample;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Welcome
 */
public class ThreadByImplement implements Runnable{

    @Override
    public void run() {
        while(true)
        {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadByExtend.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public static void main(String[] args)
    {
        ThreadByImplement objThread=new ThreadByImplement();
        Thread t=new Thread(objThread);
        t.start();
    }
    
}
