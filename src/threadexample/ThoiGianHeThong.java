/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threadexample;

import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TAID
 *          De bai:Dùng Thread để lấy ra giây của hệ thống và hiển thị ra màn hình
 */
public class ThoiGianHeThong extends Thread{
    public void run()
    {
        while(true){
            Calendar cal = Calendar.getInstance();
            int second = cal.get(Calendar.SECOND);
            System.out.println("Second:"+second);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThoiGianHeThong.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public static void main(String[] args) {
        ThoiGianHeThong objT=new ThoiGianHeThong();
        objT.start();
    }
    
}
