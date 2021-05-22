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
public class ThreadByExtend extends Thread{
    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadByExtend.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public static void main(String[] args)
    {
        ThreadByExtend objThread=new ThreadByExtend();
        objThread.start();
    }
    
}
